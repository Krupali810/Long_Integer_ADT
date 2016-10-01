
public class LongInteger {

    boolean isNeg = false;
//    private SimpleList list = new SLLSimpleList(); //by me
    private SimpleList list = new ArraySimpleList(); //by me

    String s;
    private boolean sign = false;
    private int digLength = 0;

    public LongInteger(String s) {
        this.s = s;
        //isNeg = getSign();
        char f = s.charAt(0);
        if (f == '-') {
            isNeg = true;
            sign = true;
            s = s.substring(1);
        }

        //getDigitCount();
        digLength = s.length();

        if (!list.isSLL()) {
            int arr_size = (digLength / 4) + 1;
            list = new ArraySimpleList(arr_size);
        }
        int mod;
        int val;
        String subStr;
        mod = s.length() % 4;
        if (mod > 0) {
            subStr = s.substring(0, mod);
            val = Integer.parseInt(subStr);

            list.insertFirst(val);
//            list.insertLast(val);
            s = s.substring(mod);
        }

        while (s.length() != 0) {
            subStr = s.substring(0, 4);
            val = Integer.parseInt(subStr);
            list.insertFirst(val);
//            list.insertLast(val);
            s = s.substring(4);
        }

    }

    public LongInteger() {

    }

    public LongInteger(int size) {

        if (!list.isSLL()) {
            list = new ArraySimpleList(size);
        }

    }

    public void output() {
        Position tempNode = list.last();

        UtilityOperations objUO = new UtilityOperations();

        String temp2 = null;

        String temp3 = null;
        int size = 0;
        while (tempNode != null) {

            int CNValue = tempNode.getValue();

            int CNLen = objUO.digits(CNValue);
            size = size + CNLen;
            if (CNLen != 4) {

                temp3 = String.format("%04d", CNValue);

            } else {

                temp3 = Integer.toString(CNValue);

            }

            if (list.isLast(tempNode)) {

                if (getSign()) {
                    temp2 = "-" + Integer.toString(CNValue);

                } else {
                    temp2 = Integer.toString(CNValue);

                }

            } else {
                temp2 = temp2 + temp3;
            }

            tempNode = list.before(tempNode);

        }
        if (digLength == 0) {
            digLength = size;
        }
        System.out.println(temp2);;
    }

    public void nodeDisplay() {
        Position head = list.first();
        Position tail = list.last();
        System.out.print("Head -> ");
        while (head != null) {

            System.out.print(head.getValue());
            System.out.print(" -> ");
            head = list.after(head);
        }
        System.out.print("NULL");
    }

    public boolean getSign() {

        return sign;
    }

    public int getDigitCount() {

        return digLength;

    }

    public boolean equalTo(LongInteger i) {

        boolean i_sign = i.getSign();
        Position la_one = list.last();
        Position la_two = i.list.last();

        if (getDigitCount() == i.getDigitCount()) {
            if (i_sign == getSign()) {
                while (!list.isFirst(la_one)) {
                    if (la_one.getValue() != la_two.getValue()) {
                        return false;
                    }

                    la_one = list.before(la_one);
                    la_two = i.list.before(la_two);
                }
                if (la_one.getValue() != la_two.getValue()) {
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean lessThan(LongInteger i) {
        boolean i_sign = i.getSign();
        Position la_one = list.last();
        Position lb_two = i.list.last();
        int i_length = i.getDigitCount();
        int la_digitcnt = getDigitCount();

//sign condition
        //if both signs are different 
        if (i_sign != getSign()) {
            if (getSign()) {
                //la is -ve
                return true;
            }
            return false;

        } //both positive 
        else if (!getSign()) {
            if (la_digitcnt > i_length) {
                return false;
            } else if (la_digitcnt < i_length) {
                return true;
            } else if (equalTo(i)) {
                return false;
            } else {
                while (!list.isFirst(la_one)) {

                    if (la_one.getValue() < lb_two.getValue()) {
                        la_one = list.before(la_one);
                        lb_two = list.before(lb_two);

                    } else {
                        return false;
                    }

                }
                if (la_one.getValue() < lb_two.getValue()) {
                    return true;
                }
            }
        } //both negative
        else {

            if (la_digitcnt > i_length) {
                return true;
            } else if (la_digitcnt < i_length) {
                return false;
            } else if (equalTo(i)) {
                return false;
            } else {
                while (!list.isFirst(la_one)) {

                    if (la_one.getValue() < lb_two.getValue()) {
                        la_one = list.before(la_one);
                        lb_two = list.before(lb_two);

                    } else {
                        return true;
                    }

                }
                if (la_one.getValue() < lb_two.getValue()) {
                    return false;
                }

            }
        }
        return true;
    }

    public boolean greaterThan(LongInteger i) {

        Position la_one = list.last();
        Position lb_two = i.list.last();

        boolean i_sign = i.getSign();
//sign condition
        //if both signs are different 
        if (i_sign != getSign()) {
            if (getSign()) {
                //la is -ve
                return false;
            }
            return true;

        } //both positive 
        else if (!getSign()) {
            if (this.getDigitCount() > i.getDigitCount()) {
                return true;
            } else if (this.getDigitCount() < i.getDigitCount()) {
                return false;
            } else if (equalTo(i)) {
                return false;
            } else {
                while (!list.isFirst(la_one)) {

                    if (la_one.getValue() > lb_two.getValue()) {
                        la_one = list.before(la_one);
                        lb_two = list.before(lb_two);

                    } else {
                        return false;
                    }

                }
                if (la_one.getValue() > lb_two.getValue()) {
                    return true;
                }
            }
        } //both negative
        else {

            if (this.getDigitCount() > i.getDigitCount()) {
                return false;
            } else if (this.getDigitCount() < i.getDigitCount()) {
                return true;
            } else if (equalTo(i)) {
                return false;
            } else {
                while (!list.isFirst(la_one)) {

                    if (la_one.getValue() > lb_two.getValue()) {
                        la_one = list.before(la_one);
                        lb_two = list.before(lb_two);

                    } else {
                        return true;
                    }

                }
                if (la_one.getValue() > lb_two.getValue()) {
                    return false;
                }

            }
        }
        return true;
    }

    public LongInteger add(LongInteger i) {
        LongInteger sum_result = new LongInteger();
        UtilityOperations uo = new UtilityOperations();

        int val1_dc = getDigitCount();
        int val2_dc = i.getDigitCount();
        int add_az;
        if (val1_dc > val2_dc) {
            add_az = (val1_dc / 4) + 1;
        } else {

            add_az = (val2_dc / 4) + 1;
        }
        if (!list.isSLL()) {
            sum_result = new LongInteger(add_az);
        }

        boolean one_sign = getSign();
        boolean two_sign = i.getSign();
        int carry = 0;
        int node1_val = 0;
        int node2_val = 0;
        int node_sum = 0;
        int intr_sum = 0;
        if (one_sign == two_sign) {
            sum_result.sign = one_sign;
            Position node_one = list.first();
            Position node_two = i.list.first();

            while (node_one != null && node_two != null) {
                node1_val = node_one.getValue();
                node2_val = node_two.getValue();

                intr_sum = carry + node1_val + node2_val; //with carry 
                node_sum = uo.overflow(intr_sum);
                carry = uo.underflow(intr_sum);
                sum_result.list.insertLast(node_sum);

                if (list.after(node_one) == null && i.list.after(node_two) == null && carry > 0) {

                    sum_result.list.insertLast(carry);
                }
                node_one = list.after(node_one);
                node_two = i.list.after(node_two);

            }

            if (node_one == null) //no nodes in list1 but there nodes in list 2 
            {
                while (node_two != null) {
                    node2_val = node_two.getValue();
                    intr_sum = carry + node2_val;
                    node_sum = uo.overflow(intr_sum);
                    carry = uo.underflow(intr_sum);
                    sum_result.list.insertLast(node_sum);

                    if (i.list.after(node_two) == null && carry > 0) {

                        sum_result.list.insertLast(carry);

                    }

                    node_two = i.list.after(node_two);
                }

            } else //no nodes in list2 but there are nodes in list 1 
            {

                while (node_one != null) {
                    node1_val = node_one.getValue();
                    intr_sum = carry + node1_val;
                    node_sum = uo.overflow(intr_sum);
                    carry = uo.underflow(intr_sum);
                    sum_result.list.insertLast(node_sum);

                    if (list.after(node_one) == null && carry > 0) {
                        sum_result.list.insertLast(carry);
                    }
                    node_one = list.after(node_one);
                }
            }

        } else {
            i.sign = !i.sign;
            sum_result = this.subtract(i);
            i.sign = true;
            sign = true;
        }
        this.sign = one_sign;
        i.sign = two_sign;
        return sum_result;

    }

    public LongInteger subtract(LongInteger i) {
        LongInteger sub_result = new LongInteger();
        int val1_dc = getDigitCount();
        int val2_dc = i.getDigitCount();
        int sub_az;
        if (val1_dc > val2_dc) {
            sub_az = (val1_dc / 4) + 2;
        } else {

            sub_az = (val2_dc / 4) + 2;
        }
        if (!list.isSLL()) {
            sub_result = new LongInteger(sub_az);
        }
        boolean one_sign = this.sign;
        boolean two_sign = i.sign;
        i.sign = !two_sign;
        boolean isBorrow = false;
        int int_diff;
        int val1, val2;

        if (one_sign == i.sign) {
            sub_result = this.add(i);
            sub_result.sign = one_sign;
            sign = one_sign;
            i.sign = two_sign;
            return sub_result;
        } else {
            sign = false;
            i.sign = false;

            Position one_sub = list.first();
            Position two_sub = i.list.first();

            boolean gt = greaterThan(i);
            if (this.equalTo(i)) {
                sub_result.list.insertLast(0);
                sub_result.sign = false;
                sign = one_sign;
                i.sign = two_sign;

                return sub_result;
            }
//            
            if (gt) {
                //one is greater then two
                sub_result.sign = one_sign;
                while (one_sub != null && two_sub != null) {
                    val1 = one_sub.getValue();
                    val2 = two_sub.getValue();

                    if (isBorrow) {
                        val1 = val1 - 1;
                        isBorrow = false;
                    }
                    if (val1 < val2) {
                        isBorrow = true;
                        val1 = val1 + 10000;

                    }
                    int_diff = val1 - val2;

                    sub_result.list.insertLast(int_diff);
                    one_sub = list.after(one_sub);
                    two_sub = i.list.after(two_sub);
                }

                while (one_sub != null) {
                    val1 = one_sub.getValue();
                    if (isBorrow) {
                        val1 = val1 - 1;
                        isBorrow = false;
                    }
                    sub_result.list.insertLast(val1);
                    one_sub = list.after(one_sub);

                }
            } else {
                sub_result.sign = !two_sign;
                while (one_sub != null && two_sub != null) {
                    val1 = one_sub.getValue();
                    val2 = two_sub.getValue();

                    if (isBorrow) {
                        val2 = val2 - 1;
                        isBorrow = false;
                    }
                    if (val2 < val1) {
                        isBorrow = true;
                        val2 = val2 + 10000;

                    }
                    int_diff = val2 - val1;

                    sub_result.list.insertLast(int_diff);
                    one_sub = list.after(one_sub);
                    two_sub = i.list.after(two_sub);
                }

                while (two_sub != null) {
                    val2 = two_sub.getValue();
                    if (isBorrow) {
                        val2 = val2 - 1;
                        isBorrow = false;
                    }
                    sub_result.list.insertLast(val2);
                    two_sub = i.list.after(two_sub);

                }

                sign = one_sign;
                i.sign = two_sign;
            }
        }
        sign = one_sign;
        i.sign = two_sign;
        return sub_result;
    }

    public LongInteger multiply(LongInteger i) {
        LongInteger mul_result = new LongInteger();
        int mul_az;
        mul_az = ((getDigitCount() + i.getDigitCount()) / 4) + 2;

        if (!list.isSLL()) {
            mul_result = new LongInteger(mul_az);
        }
        UtilityOperations uo = new UtilityOperations();

        int carry = 0; //multiplication result underflow 
        int zero_node = 0;
        int temp_mul = 0;
        int up_val = 0; //left, this node
        int down_val = 0; //right i.this node
        int mul_ovf = 0; //multiplication result overflow 

        Position down_node = i.list.first();
        boolean up_sign = this.getSign();
        boolean down_sign = i.getSign();

        this.sign = true;
        i.sign = true;

        while (down_node != null) {
            //while the value of upper multiplication long integer is not null
            down_val = down_node.getValue();

            Position up_node = list.first();

            LongInteger temp_res = new LongInteger();

            if (!list.isSLL()) {
                temp_res = new LongInteger(mul_az);
            }
            while (up_node != null) {
                up_val = up_node.getValue();
                if (list.isFirst(up_node)) {
                    for (int idx = 0; idx < zero_node; idx++) {
                        temp_res.list.insertLast(0);
                        temp_res.digLength = temp_res.digLength + 4;
                    }
                }

                temp_mul = (down_val * up_val + carry);
                mul_ovf = uo.overflow(temp_mul);
                carry = uo.underflow(temp_mul);
                temp_res.list.insertLast(mul_ovf);
                temp_res.digLength = temp_res.digLength + 4;

                if (list.after(up_node) == null && carry > 0) {
                    temp_res.list.insertLast(carry);
                    temp_res.digLength = temp_res.digLength + 4;
                    carry = 0;
                }
                up_node = list.after(up_node);
            }

            zero_node = zero_node + 1;
            mul_result = mul_result.add(temp_res);
            mul_result.digLength = temp_res.getDigitCount() + 1;
            down_node = i.list.after(down_node);
        }

        if (up_sign == true || down_sign == true) {
            mul_result.sign = true;
        }

        sign = up_sign;
        i.sign = down_sign;
        return mul_result;
    }

    public LongInteger power(int p) {
        LongInteger pow_result = new LongInteger();
        LongInteger temp_power = new LongInteger();
        LongInteger original = new LongInteger();
        boolean i_sign = sign;
//        sign = false;
        original = this;
        temp_power = original;
        int pow_az = 1;

        if (!list.isSLL()) {
            pow_result = new LongInteger(pow_az);
        }

        Position num = list.first();
        int[] two_pwr = new int[30]; //stores the count of power 2 results computed
        int idx_two_pwr = 1;
        int i = 0, j = 0;
        int pwr_diff = 0;

        pow_result.list.insertLast(1);
        if (p == 0) {
            return pow_result;
        }
        while (p >= idx_two_pwr) {
            two_pwr[i] = idx_two_pwr;
            idx_two_pwr = idx_two_pwr * 2;
            i++;
        }

        int two_limit = i;

        //now idx_two_pwr will store all powers of 2 less than p
        //need to compute powers of p needed and store them in p_val array
        int[] p_val = new int[i]; //number of index of power needed 

        pwr_diff = p;
        j = 0;
        int temp_pd;
        for (int k = i - 1; k >= 0; k--) {
            if (pwr_diff >= two_pwr[k]) {
                pwr_diff = pwr_diff - two_pwr[k];
                p_val[j] = two_pwr[k];
                j++;
            }
        }

        if (p == 1) {
            pow_result = original;
            return pow_result;
        }
        int iterator;

        int p_limit = j;
        for (iterator = 0; iterator <= two_limit; iterator++) {
            if (two_pwr[iterator] != 1) {
                temp_power = temp_power.multiply(temp_power);
            }
            for (int c = 0; c < p_limit; c++) {
                int pwr_val = two_pwr[iterator];
                if (p_val[c] == pwr_val) {
                    pow_result = pow_result.multiply(temp_power);
                }
            }
        }
        if (p % 2 == 0) {
            pow_result.sign = false;
        } else {
            pow_result.sign = i_sign;
        }

        return pow_result;

    }
}
