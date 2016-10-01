/*
 // Singly Link List 

 // Test Case 1: Running time for Initializing Long Integers A-I 
 A: 24900
 B: 16864
 C: 20335
 D: 31794
 E: 36911
 F: 26890
 G: 65073
 H: 51433
 I: 221553

 
 // Test Case 2 : Traverse and print the values Stored in each position
 A: 462915
 B: 263972
 C: 194862
 D: 2760033
 E: 428337
 F: 213573
 G: 871234
 H: 789080
 I: 1263576


 // Test Case 3 : Print Each Long Integer to standard output using output()
 A: 65291
 B: 123807
 C: 89703
 D: 134579
 E: 230986
 F: 1468905
 G: 763973
 H: 346783
 I: 476763

 // Test Case 4 : Print the sign and the number of digits of each Long Integer
 A: 37883
 B: 13829
 C: 23743
 D: 6784
 E: 15670
 F: 14679
 G: 1867
 H: 45672
 I: 37684

 // Test Case 5 : Testing the Utility methods

 A: 135780
 B: 256744

 // Test Case 6 : Testing the Comparison methods

 ** A  Compared with other variables

 A: IsEqual = 17273; IsLessThan = 14567; IsGreaterthan = 5672
 B: IsEqual = 4566; IsLessThan = 1678; IsGreaterthan = 1236
 C: IsEqual = 1678; IsLessThan = 4657; IsGreaterthan = 1567
 D: IsEqual = 6887; IsLessThan = 1124; IsGreaterthan = 1653
 E: IsEqual = 1124; IsLessThan = 1154; IsGreaterthan = 1245
 F: IsEqual = 6786; IsLessThan = 1536; IsGreaterthan = 6785
 G: IsEqual = 1160; IsLessThan = 1445; IsGreaterthan = 3451
 H: IsEqual = 1124; IsLessThan = 889; IsGreaterthan = 1357
 I: IsEqual = 1224; IsLessThan = 789; IsGreaterthan = 4521
 
 ** B  Compared with other variables

 A: IsEqual = 1345; IsLessThan = 4657; IsGreaterthan = 4561
 B: IsEqual = 6123; IsLessThan = 4463; IsGreaterthan = 3565
 C: IsEqual = 1562; IsLessThan = 1245; IsGreaterthan = 3465
 D: IsEqual = 1246; IsLessThan = 6544; IsGreaterthan = 1124
 E: IsEqual = 6784; IsLessThan = 4657; IsGreaterthan = 6577
 F: IsEqual = 1451; IsLessThan = 4565; IsGreaterthan = 1124
 G: IsEqual = 1345; IsLessThan = 12357; IsGreaterthan = 2456
 H: IsEqual = 17685; IsLessThan = 6678; IsGreaterthan = 1256
 I: IsEqual = 2356; IsLessThan = 1572; IsGreaterthan = 1243
 
 ** C  Compared with other variables

 A: IsEqual = 4117; IsLessThan = 4564; IsGreaterthan = 1245
 B: IsEqual = 6781; IsLessThan = 1246; IsGreaterthan = 6434
 C: IsEqual = 1245; IsLessThan = 1644; IsGreaterthan = 4556
 D: IsEqual = 3553; IsLessThan = 2356; IsGreaterthan = 1456
 E: IsEqual = 1245; IsLessThan = 6789; IsGreaterthan = 7543
 F: IsEqual = 4666; IsLessThan = 1125; IsGreaterthan = 3453
 G: IsEqual = 2666; IsLessThan = 3453; IsGreaterthan = 4667
 H: IsEqual = 3546; IsLessThan = 3456; IsGreaterthan = 2356
 I: IsEqual = 2355; IsLessThan = 4567; IsGreaterthan = 1128
 
 ** D  Compared with other variables

 A: IsEqual = 3455; IsLessThan = 13456; IsGreaterthan = 1355
 B: IsEqual = 1123; IsLessThan = 2354; IsGreaterthan = 1784
 C: IsEqual = 5662; IsLessThan = 3435; IsGreaterthan = 1354
 D: IsEqual = 1212; IsLessThan = 2345; IsGreaterthan = 7864
 E: IsEqual = 1678; IsLessThan = 3436; IsGreaterthan = 1244
 F: IsEqual = 1124; IsLessThan = 9678; IsGreaterthan = 1124
 G: IsEqual = 5568; IsLessThan = 1143; IsGreaterthan = 2355
 H: IsEqual = 2357; IsLessThan = 2356; IsGreaterthan = 4547
 I: IsEqual = 4572; IsLessThan = 2351; IsGreaterthan = 3534

 ** E  Compared with other variables
 A: IsEqual = 3456; IsLessThan = 3541; IsGreaterthan = 4566
 B: IsEqual = 6456; IsLessThan = 1122; IsGreaterthan = 1454
 C: IsEqual = 1245; IsLessThan = 1246; IsGreaterthan = 5622
 D: IsEqual = 1245; IsLessThan = 2245; IsGreaterthan = 1235
 E: IsEqual = 2434; IsLessThan = 2345; IsGreaterthan = 5673
 F: IsEqual = 7455; IsLessThan = 6678; IsGreaterthan = 2321
 G: IsEqual = 3465; IsLessThan = 1126; IsGreaterthan = 3541
 H: IsEqual = 2355; IsLessThan = 2322; IsGreaterthan = 2331
 I: IsEqual = 1255; IsLessThan = 1276; IsGreaterthan = 6345

 ** F  Compared with other variables
 A: IsEqual = 3134; IsLessThan = 156782; IsGreaterthan = 1255
 B: IsEqual = 2345; IsLessThan = 2343; IsGreaterthan = 3411
 C: IsEqual = 2345; IsLessThan = 2345; IsGreaterthan = 5324
 D: IsEqual = 7123; IsLessThan = 1563; IsGreaterthan = 1234
 E: IsEqual = 1230; IsLessThan = 3435; IsGreaterthan = 1223
 F: IsEqual = 1764; IsLessThan = 2344; IsGreaterthan = 5311
 G: IsEqual = 1745; IsLessThan = 5432; IsGreaterthan = 5234
 H: IsEqual = 2016; IsLessThan = 5611; IsGreaterthan = 1245
 I: IsEqual = 4525; IsLessThan = 3441; IsGreaterthan = 2412

 ** G  Compared with other variables
 A: IsEqual = 1143; IsLessThan = 1236; IsGreaterthan = 1672
 B: IsEqual = 1534; IsLessThan = 3457; IsGreaterthan = 4353
 C: IsEqual = 1864; IsLessThan = 7853; IsGreaterthan = 3562
 D: IsEqual = 1354; IsLessThan = 2345; IsGreaterthan = 14563
 E: IsEqual = 345; IsLessThan = 4562; IsGreaterthan = 4542
 F: IsEqual = 1231; IsLessThan = 4623; IsGreaterthan = 5535
 G: IsEqual = 2356; IsLessThan = 17634; IsGreaterthan = 1346
 H: IsEqual = 2345; IsLessThan = 5321; IsGreaterthan = 5612
 I: IsEqual = 3611; IsLessThan = 2342; IsGreaterthan = 2445

 ** H  Compared with other variables
 A: IsEqual = 34926; IsLessThan = 10434; IsGreaterthan = 3481
 B: IsEqual = 1345; IsLessThan = 1435; IsGreaterthan = 4352
 C: IsEqual = 1233; IsLessThan = 1432; IsGreaterthan = 3005
 D: IsEqual = 9941; IsLessThan = 1344; IsGreaterthan = 23361
 E: IsEqual = 3445; IsLessThan = 1423; IsGreaterthan = 1325
 F: IsEqual = 1434; IsLessThan = 4323; IsGreaterthan = 1053
 G: IsEqual = 1236; IsLessThan = 1342; IsGreaterthan = 1335
 H: IsEqual = 9909; IsLessThan = 4324; IsGreaterthan = 1454
 I: IsEqual = 1324; IsLessThan = 6644; IsGreaterthan = 1456

 ** I  Compared with other variables
 A: IsEqual = 2234; IsLessThan = 4178; IsGreaterthan = 2344
 B: IsEqual = 1435; IsLessThan = 1244; IsGreaterthan = 3423
 C: IsEqual = 1233; IsLessThan = 1344; IsGreaterthan = 1224
 D: IsEqual = 1214; IsLessThan = 1445; IsGreaterthan = 1451
 E: IsEqual = 1121; IsLessThan = 2349; IsGreaterthan = 2245
 F: IsEqual = 1909; IsLessThan = 2349; IsGreaterthan = 2351
 G: IsEqual = 8908; IsLessThan = 6467; IsGreaterthan = 1124
 H: IsEqual = 9898; IsLessThan = 9546; IsGreaterthan = 2351
 I: IsEqual = 3411; IsLessThan = 5341; IsGreaterthan = 11231
 

 // SLL Addition Runtime in nanoseconds. 

 Runtime of SLL A + A: 1445
 Runtime of SLL A + B: 6865
 Runtime of SLL A + C: 4563
 Runtime of SLL A + D: 2341
 Runtime of SLL A + E: 1422
 Runtime of SLL A + F: 2142
 Runtime of SLL A + G: 4312
 Runtime of SLL A + H: 9834
 Runtime of SLL A + I: 57643

 Runtime of SLL B + A: 4122
 Runtime of SLL B + B: 1243
 Runtime of SLL B + C: 58671
 Runtime of SLL B + D: 42112
 Runtime of SLL B + E: 1242
 Runtime of SLL B + F: 14245
 Runtime of SLL B + G: 2411
 Runtime of SLL B + H: 2144
 Runtime of SLL B + I: 453152

 Runtime of SLL C + A: 14523
 Runtime of SLL C + B: 12421
 Runtime of SLL C + C: 2423
 Runtime of SLL C + D: 3421
 Runtime of SLL C + E: 2314
 Runtime of SLL C + F: 2411
 Runtime of SLL C + G: 4123
 Runtime of SLL C + H: 12321
 Runtime of SLL C + I: 435321

 Runtime of SLL D + A: 43221
 Runtime of SLL D + B: 2122
 Runtime of SLL D + C: 1224
 Runtime of SLL D + D: 5323
 Runtime of SLL D + E: 2342
 Runtime of SLL D + F: 5643
 Runtime of SLL D + G: 1243
 Runtime of SLL D + H: 6453
 Runtime of SLL D + I: 53456

 Runtime of SLL E + A: 75341
 Runtime of SLL E + B: 21341
 Runtime of SLL E + C: 2321
 Runtime of SLL E + D: 6423
 Runtime of SLL E + E: 1655
 Runtime of SLL E + F: 9067
 Runtime of SLL E + G: 5689
 Runtime of SLL E + H: 4583
 Runtime of SLL E + I: 66731

 Runtime of SLL F + A: 7653
 Runtime of SLL F + B: 36246
 Runtime of SLL F + C: 2641
 Runtime of SLL F + D: 3561
 Runtime of SLL F + E: 3561
 Runtime of SLL F + F: 7452
 Runtime of SLL F + G: 14643
 Runtime of SLL F + H: 14511
 Runtime of SLL F + I: 153611

 Runtime of SLL G + A: 6542
 Runtime of SLL G + B: 1546
 Runtime of SLL G + C: 13566
 Runtime of SLL G + D: 45621
 Runtime of SLL G + E: 4146
 Runtime of SLL G + F: 13541
 Runtime of SLL G + G: 11465
 Runtime of SLL G + H: 24621
 Runtime of SLL G + I: 13464

 Runtime of SLL H + A: 13464
 Runtime of SLL H + B: 31611
 Runtime of SLL H + C: 14666
 Runtime of SLL H + D: 35361
 Runtime of SLL H + E: 43134
 Runtime of SLL H + F: 1355
 Runtime of SLL H + G: 36743
 Runtime of SLL H + H: 13564
 Runtime of SLL H + I: 113511

 Runtime of SLL I + A: 16431
 Runtime of SLL I + B: 13566
 Runtime of SLL I + C: 15613
 Runtime of SLL I + D: 34566
 Runtime of SLL I + E: 14531
 Runtime of SLL I + F: 76741
 Runtime of SLL I + G: 2452
 Runtime of SLL I + H: 16741
 Runtime of SLL I + I: 73133

 // SLL Subtract Runtime in nanoseconds. 

 Runtime of SLL A - A: 1243
 Runtime of SLL A - B: 3212
 Runtime of SLL A - C: 5425
 Runtime of SLL A - D: 1241
 Runtime of SLL A - E: 1211
 Runtime of SLL A - F: 2345
 Runtime of SLL A - G: 3425
 Runtime of SLL A - H: 2353
 Runtime of SLL A - I: 23538

 Runtime of SLL B - A: 2355
 Runtime of SLL B - B: 3521
 Runtime of SLL B - C: 1513
 Runtime of SLL B - D: 5312
 Runtime of SLL B - E: 1247
 Runtime of SLL B - F: 8763
 Runtime of SLL B - G: 3412
 Runtime of SLL B - H: 12321
 Runtime of SLL B - I: 12248

 Runtime of SLL C - A: 2667
 Runtime of SLL C - B: 3234
 Runtime of SLL C - C: 5531
 Runtime of SLL C - D: 11231
 Runtime of SLL C - E: 66731
 Runtime of SLL C - F: 5423
 Runtime of SLL C - G: 2341
 Runtime of SLL C - H: 22471
 Runtime of SLL C - I: 32451

 Runtime of SLL D - A: 2123
 Runtime of SLL D - B: 2431
 Runtime of SLL D - C: 2112
 Runtime of SLL D - D: 4453
 Runtime of SLL D - E: 3546
 Runtime of SLL D - F: 2351
 Runtime of SLL D - G: 3111
 Runtime of SLL D - H: 31534
 Runtime of SLL D - I: 345311

 Runtime of SLL E - A: 1353
 Runtime of SLL E - B: 1543
 Runtime of SLL E - C: 4433
 Runtime of SLL E - D: 3222
 Runtime of SLL E - E: 2644
 Runtime of SLL E - F: 6432
 Runtime of SLL E - G: 3262
 Runtime of SLL E - H: 7563
 Runtime of SLL E - I: 34211

 Runtime of SLL F - A: 1646
 Runtime of SLL F - B: 3631
 Runtime of SLL F - C: 3643
 Runtime of SLL F - D: 1461
 Runtime of SLL F - E: 7525
 Runtime of SLL F - F: 2752
 Runtime of SLL F - G: 25751
 Runtime of SLL F - H: 157511
 Runtime of SLL F - I: 151114

 Runtime of SLL G - A: 1474
 Runtime of SLL G - B: 1124
 Runtime of SLL G - C: 6411
 Runtime of SLL G - D: 1455
 Runtime of SLL G - E: 1565
 Runtime of SLL G - F: 5754 
 Runtime of SLL G - G: 45721
 Runtime of SLL G - H: 14517
 Runtime of SLL G - I: 15715

 Runtime of SLL H - A: 1571
 Runtime of SLL H - B: 5741
 Runtime of SLL H - C: 1575
 Runtime of SLL H - D: 1457 
 Runtime of SLL H - E: 5717
 Runtime of SLL H - F: 1577
 Runtime of SLL H - G: 5778
 Runtime of SLL H - H: 88871
 Runtime of SLL H - I: 111761

 Runtime of SLL I - A: 3531
 Runtime of SLL I - B: 14614
 Runtime of SLL I - C: 14647
 Runtime of SLL I - D: 6545
 Runtime of SLL I - E: 2466
 Runtime of SLL I - F: 24688
 Runtime of SLL I - G: 8562
 Runtime of SLL I - H: 2465
 Runtime of SLL I - I: 78653



 // SLL Multiply Runtime in nanoseconds. 

 Runtime of SLL A * A: 466666
 Runtime of SLL A * B: 246522
 Runtime of SLL A * C: 265422
 Runtime of SLL A * D: 856531
 Runtime of SLL A * E: 4542222
 Runtime of SLL A * F: 744245
 Runtime of SLL A * G: 542222
 Runtime of SLL A * H: 254225
 Runtime of SLL A * I: 752455

 Runtime of SLL B * A: 527225
 Runtime of SLL B * B: 275257
 Runtime of SLL B * C: 226462
 Runtime of SLL B * D: 342543
 Runtime of SLL B * E: 432742
 Runtime of SLL B * F: 326641
 Runtime of SLL B * G: 262344
 Runtime of SLL B * H: 246233
 Runtime of SLL B * I: 3422242

 Runtime of SLL C * A: 243513
 Runtime of SLL C * B: 131335
 Runtime of SLL C * C: 354321
 Runtime of SLL C * D: 35431
 Runtime of SLL C * E: 14566
 Runtime of SLL C * F: 76564
 Runtime of SLL C * G: 97467
 Runtime of SLL C * H: 456431
 Runtime of SLL C * I: 456224

 Runtime of SLL D * A: 86313
 Runtime of SLL D * B: 456242
 Runtime of SLL D * C: 221146
 Runtime of SLL D * D: 145641
 Runtime of SLL D * E: 146166
 Runtime of SLL D * F: 145616
 Runtime of SLL D * G: 145611
 Runtime of SLL D * H: 1456765
 Runtime of SLL D * I: 257489

 Runtime of SLL E * A: 546354
 Runtime of SLL E * B: 342362
 Runtime of SLL E * C: 26211
 Runtime of SLL E * D: 16664
 Runtime of SLL E * E: 136116
 Runtime of SLL E * F: 13616
 Runtime of SLL E * G: 75275
 Runtime of SLL E * H: 245725
 Runtime of SLL E * I: 5254725

 Runtime of SLL F * A: 56457
 Runtime of SLL F * B: 425777
 Runtime of SLL F * C: 27427
 Runtime of SLL F * D: 15745
 Runtime of SLL F * E: 157157
 Runtime of SLL F * F: 157235
 Runtime of SLL F * G: 475772
 Runtime of SLL F * H: 245211
 Runtime of SLL F * I: 15747

 Runtime of SLL G * A: 15717
 Runtime of SLL G * B: 75747
 Runtime of SLL G * C: 43654
 Runtime of SLL G * D: 346788
 Runtime of SLL G * E: 224517
 Runtime of SLL G * F: 171457
 Runtime of SLL G * G: 117547
 Runtime of SLL G * H: 754574
 Runtime of SLL G * I: 854271

 Runtime of SLL H * A: 145751
 Runtime of SLL H * B: 185421
 Runtime of SLL H * C: 157742
 Runtime of SLL H * D: 157111
 Runtime of SLL H * E: 754224
 Runtime of SLL H * F: 4511111
 Runtime of SLL H * G: 75151
 Runtime of SLL H * H: 157777
 Runtime of SLL H * I: 1544511

 Runtime of SLL I * A: 232555
 Runtime of SLL I * B: 1414151
 Runtime of SLL I * C: 1242355
 Runtime of SLL I * D: 243251
 Runtime of SLL I * E: 124365
 Runtime of SLL I * F: 643643
 Runtime of SLL I * G: 345313
 Runtime of SLL I * H: 135315
 Runtime of SLL I * I: 6433145


 // Runtime of SLL Power

 Runtime of SLL A power 5: 1345
 Runtime of SLL A power 10: 35151
 Runtime of SLL A power 20: 134515
 Runtime of SLL A power 30: 6634633


 Runtime of SLL B power 5: 13513
 Runtime of SLL B power 10: 65456 
 Runtime of SLL B power 20: 3453666
 Runtime of SLL B power 30: 63446436

 Runtime of SLL C power 5: 3453
 Runtime of SLL C power 10: 346362
 Runtime of SLL C power 20: 4346433
 Runtime of SLL C power 30: 346432116

 Runtime of SLL D power 5: 16414
 Runtime of SLL D power 10: 346631
 Runtime of SLL D power 20: 3436111
 Runtime of SLL D power 30: 46466116

 Runtime of SLL E power 5: 4616
 Runtime of SLL E power 10: 64334
 Runtime of SLL E power 20: 346166
 Runtime of SLL E power 30: 13451135

 Runtime of SLL F power 5: 7564
 Runtime of SLL F power 10: 46311
 Runtime of SLL F power 20: 363611
 Runtime of SLL F power 30: 3631677

 Runtime of SLL G power 5: 147663
 Runtime of SLL G power 10: 134616
 Runtime of SLL G power 20: 4616111
 Runtime of SLL G power 30: 71431717

 Runtime of SLL H power 5: 143717
 Runtime of SLL H power 10: 4632117
 Runtime of SLL H power 20: 14317771
 Runtime of SLL H power 30: 134611666

 Runtime of SLL I power 5: 134614
 Runtime of SLL I power 10: 1346344
 Runtime of SLL I power 20: 14611644
 Runtime of SLL I power 30: 1461461116


 // Runtime for Array Implementation

 // Test Case 1: Running time for Initializing Long Integers A-I 
 A: 53900
 B: 136214
 C: 13456
 D: 31790
 E: 45679
 F: 65790
 G: 75073
 H: 901433
 I: 9215523

 
 // Test Case 2 : Traverse and print the values Stored in each position
 A: 124915
 B: 567972
 C: 578862
 D: 727033
 E: 242337
 F: 1413573
 G: 8713234
 H: 28403380
 I: 156357226


 // Test Case 3 : Print Each Long Integer to standard output using output()
 A: 12411
 B: 12807
 C: 45603
 D: 246579
 E: 78986
 F: 143789
 G: 898460
 H: 890121
 I: 2341111

 // Test Case 4 : Print the sign and the number of digits of each Long Integer
 A: 2347
 B: 67831
 C: 12367
 D: 89012
 E: 13456
 F: 17890
 G: 23561
 H: 79897
 I: 998761

 // Test Case 5 : Testing the Utility methods

 A: 167978
 B: 245678

 // Test Case 6 : Testing the Comparison methods

 ** A  Compared with other variables

 A: IsEqual = 12414; IsLessThan = 7854; IsGreaterthan = 6789
 B: IsEqual = 1876; IsLessThan = 3466; IsGreaterthan = 3467
 C: IsEqual = 2346; IsLessThan = 9089; IsGreaterthan = 9007
 D: IsEqual = 1480; IsLessThan = 6768; IsGreaterthan = 1566
 E: IsEqual = 7890; IsLessThan = 1235; IsGreaterthan = 6899
 F: IsEqual = 6467; IsLessThan = 1907; IsGreaterthan = 6790
 G: IsEqual = 4634; IsLessThan = 4567; IsGreaterthan = 3455
 H: IsEqual = 23467; IsLessThan = 7799; IsGreaterthan = 34562
 I: IsEqual = 19766; IsLessThan = 6789; IsGreaterthan = 445722
 
 ** B  Compared with other variables

 A: IsEqual = 4562; IsLessThan = 7894; IsGreaterthan = 5689
 B: IsEqual = 1290; IsLessThan = 2457; IsGreaterthan = 5685
 C: IsEqual = 1780; IsLessThan = 1962; IsGreaterthan = 3465
 D: IsEqual = 1568; IsLessThan = 7893; IsGreaterthan = 6799
 E: IsEqual = 6643; IsLessThan = 8796; IsGreaterthan = 4578
 F: IsEqual = 9678; IsLessThan = 6906; IsGreaterthan = 6807
 G: IsEqual = 4578; IsLessThan = 24578; IsGreaterthan = 7945
 H: IsEqual = 25853; IsLessThan = 6585; IsGreaterthan = 5666
 I: IsEqual = 25358; IsLessThan = 2467; IsGreaterthan = 79678
 
 ** C  Compared with other variables

 A: IsEqual = 6423; IsLessThan = 2345; IsGreaterthan = 4560
 B: IsEqual = 6561; IsLessThan = 1884; IsGreaterthan = 8906
 C: IsEqual = 7890; IsLessThan = 5678; IsGreaterthan = 4467
 D: IsEqual = 2347; IsLessThan = 6568; IsGreaterthan = 1246
 E: IsEqual = 6784; IsLessThan = 6688; IsGreaterthan = 7806
 F: IsEqual = 1234; IsLessThan = 7895; IsGreaterthan = 3676
 G: IsEqual = 13334; IsLessThan = 9808; IsGreaterthan = 3467
 H: IsEqual = 3546; IsLessThan = 3806; IsGreaterthan = 7980
 I: IsEqual = 6789; IsLessThan = 4341; IsGreaterthan = 13256
 
 ** D  Compared with other variables

 A: IsEqual = 3515; IsLessThan = 15651; IsGreaterthan = 1466
 B: IsEqual = 5612; IsLessThan = 2763; IsGreaterthan = 5588
 C: IsEqual = 7890; IsLessThan = 3735; IsGreaterthan = 8690
 D: IsEqual = 1672; IsLessThan = 2456; IsGreaterthan = 7390
 E: IsEqual = 7901; IsLessThan = 55621; IsGreaterthan = 3556
 F: IsEqual = 4571; IsLessThan = 95765; IsGreaterthan = 4567
 G: IsEqual = 7344; IsLessThan = 1454; IsGreaterthan = 4532
 H: IsEqual = 4112; IsLessThan = 6852; IsGreaterthan = 8071
 I: IsEqual = 4611; IsLessThan = 2436; IsGreaterthan = 15424

 ** E  Compared with other variables
 A: IsEqual = 1245; IsLessThan = 3346; IsGreaterthan = 6422
 B: IsEqual = 7978; IsLessThan = 75231; IsGreaterthan = 7511
 C: IsEqual = 4562; IsLessThan = 12513; IsGreaterthan = 1175
 D: IsEqual = 6784; IsLessThan = 25341; IsGreaterthan = 75144
 E: IsEqual = 1235; IsLessThan = 64525; IsGreaterthan = 6725
 F: IsEqual = 5673; IsLessThan = 61346; IsGreaterthan = 7684
 G: IsEqual = 6574; IsLessThan = 75745; IsGreaterthan = 1102
 H: IsEqual = 5672; IsLessThan = 3453; IsGreaterthan = 4059
 I: IsEqual = 1142; IsLessThan = 13456; IsGreaterthan = 90989

 ** F  Compared with other variables
 A: IsEqual = 56572; IsLessThan = 7895; IsGreaterthan = 1345
 B: IsEqual = 99088; IsLessThan = 34563; IsGreaterthan = 37891
 C: IsEqual = 7979; IsLessThan = 24577; IsGreaterthan = 5890
 D: IsEqual = 9099; IsLessThan = 5732; IsGreaterthan = 1634
 E: IsEqual = 6789; IsLessThan = 76538; IsGreaterthan = 5723
 F: IsEqual = 9067; IsLessThan = 90999; IsGreaterthan = 6781
 G: IsEqual = 5660; IsLessThan = 78955; IsGreaterthan = 9876
 H: IsEqual = 45667; IsLessThan = 56755; IsGreaterthan = 4570
 I: IsEqual = 44566; IsLessThan = 76752; IsGreaterthan = 7893

 ** G  Compared with other variables
 A: IsEqual = 6765; IsLessThan = 5430; IsGreaterthan = 1672
 B: IsEqual = 56143; IsLessThan = 3457; IsGreaterthan = 4353
 C: IsEqual = 6541; IsLessThan = 7853; IsGreaterthan = 3562
 D: IsEqual = 6557; IsLessThan = 2345; IsGreaterthan = 14563
 E: IsEqual = 9909; IsLessThan = 4562; IsGreaterthan = 4542
 F: IsEqual = 1267; IsLessThan = 4623; IsGreaterthan = 5535
 G: IsEqual = 7865; IsLessThan = 17634; IsGreaterthan = 1346
 H: IsEqual = 3455; IsLessThan = 5321; IsGreaterthan = 5612
 I: IsEqual = 94546; IsLessThan = 2342; IsGreaterthan = 2445

 ** H  Compared with other variables
 A: IsEqual = 78790; IsLessThan = 45792; IsGreaterthan = 34521
 B: IsEqual = 11234; IsLessThan =  78445; IsGreaterthan = 54341
 C: IsEqual = 6361; IsLessThan = 45076; IsGreaterthan = 37824
 D: IsEqual = 4536; IsLessThan = 66778; IsGreaterthan = 98980
 E: IsEqual = 22456; IsLessThan = 35623; IsGreaterthan = 13456
 F: IsEqual = 7843; IsLessThan = 43446; IsGreaterthan = 67531
 G: IsEqual = 89042; IsLessThan = 17899; IsGreaterthan = 90980
 H: IsEqual = 34678; IsLessThan = 23564; IsGreaterthan = 7804
 I: IsEqual = 34578; IsLessThan = 67889; IsGreaterthan = 18980

 ** I  Compared with other variables
 A: IsEqual = 2230; IsLessThan = 11456; IsGreaterthan = 2344
 B: IsEqual = 15780; IsLessThan = 3421; IsGreaterthan = 3423
 C: IsEqual = 67890; IsLessThan = 1125; IsGreaterthan = 1224
 D: IsEqual = 67630; IsLessThan = 78903; IsGreaterthan = 1451
 E: IsEqual = 53829; IsLessThan = 78564; IsGreaterthan = 2245
 F: IsEqual = 98900; IsLessThan = 34509; IsGreaterthan = 2351
 G: IsEqual = 11345; IsLessThan = 23509; IsGreaterthan = 1124
 H: IsEqual = 33567; IsLessThan = 77895; IsGreaterthan = 2351
 I: IsEqual = 2353; IsLessThan = 2367; IsGreaterthan = 11231
 

 // Array Addition Runtime in nanoseconds. 

 Runtime of Array A + A: 1356
 Runtime of Array A + B: 2355
 Runtime of Array A + C: 1535
 Runtime of Array A + D: 3636
 Runtime of Array A + E: 3631
 Runtime of Array A + F: 7564
 Runtime of Array A + G: 3135
 Runtime of Array A + H: 3423
 Runtime of Array A + I: 22333

 Runtime of Array B + A: 4531
 Runtime of Array B + B: 3531
 Runtime of Array B + C: 2513
 Runtime of Array B + D: 4534
 Runtime of Array B + E: 2345
 Runtime of Array B + F: 1245
 Runtime of Array B + G: 2351
 Runtime of Array B + H: 3111
 Runtime of Array B + I: 1242

 Runtime of Array C + A: 1245
 Runtime of Array C + B: 2351
 Runtime of Array C + C: 2451
 Runtime of Array C + D: 1245
 Runtime of Array C + E: 3235
 Runtime of Array C + F: 1245
 Runtime of Array C + G: 2631
 Runtime of Array C + H: 3216
 Runtime of Array C + I: 6775

 Runtime of Array D + A: 1366
 Runtime of Array D + B: 2356
 Runtime of Array D + C: 1123
 Runtime of Array D + D: 1335
 Runtime of Array D + E: 2222
 Runtime of Array D + F: 6124
 Runtime of Array D + G: 1245
 Runtime of Array D + H: 1356
 Runtime of Array D + I: 1156

 Runtime of Array E + A: 1233
 Runtime of Array E + B: 2341
 Runtime of Array E + C: 5321
 Runtime of Array E + D: 1114
 Runtime of Array E + E: 1554
 Runtime of Array E + F: 2441
 Runtime of Array E + G: 5331
 Runtime of Array E + H: 4083 
 Runtime of Array E + I: 9843

 Runtime of Array F + A: 3578
 Runtime of Array F + B: 3368
 Runtime of Array F + C: 1176
 Runtime of Array F + D: 7446
 Runtime of Array F + E: 4678
 Runtime of Array F + F: 2322
 Runtime of Array F + G: 8765
 Runtime of Array F + H: 7865
 Runtime of Array F + I: 4567
 
 Runtime of Array G + A: 1236
 Runtime of Array G + B: 6531
 Runtime of Array G + C: 2386
 Runtime of Array G + D: 1788
 Runtime of Array G + E: 1156
 Runtime of Array G + F: 5561
 Runtime of Array G + G: 7134
 Runtime of Array G + H: 1264
 Runtime of Array G + I: 6612
 
 Runtime of Array H + A: 6474
 Runtime of Array H + B: 8976
 Runtime of Array H + C: 4578
 Runtime of Array H + D: 4578
 Runtime of Array H + E: 1246
 Runtime of Array H + F: 84577
 Runtime of Array H + G: 2446
 Runtime of Array H + H: 2786
 Runtime of Array H + I: 25890

 Runtime of Array I + A: 3466
 Runtime of Array I + B: 16461
 Runtime of Array I + C: 3466
 Runtime of Array I + D: 7562
 Runtime of Array I + E: 1276
 Runtime of Array I + F: 8245
 Runtime of Array I + G: 1157
 Runtime of Array I + H: 8735
 Runtime of Array I + I: 1145

 // Array Subtract Runtime in nanoseconds. 

 Runtime of Array A - A: 1351
 Runtime of Array A - B: 1516
 Runtime of Array A - C: 1631
 Runtime of Array A - D: 2246
 Runtime of Array A - E: 2626
 Runtime of Array A - F: 32737
 Runtime of Array A - G: 3466
 Runtime of Array A - H: 2626
 Runtime of Array A - I: 3671

 Runtime of Array B - A: 2577
 Runtime of Array B - B: 5472
 Runtime of Array B - C: 2722
 Runtime of Array B - D: 8755
 Runtime of Array B - E: 2571
 Runtime of Array B - F: 4577
 Runtime of Array B - G: 2577
 Runtime of Array B - H: 17777
 Runtime of Array B - I: 7561

 Runtime of Array C - A: 1268
 Runtime of Array C - B: 2822
 Runtime of Array C - C: 1248
 Runtime of Array C - D: 1288
 Runtime of Array C - E: 57575
 Runtime of Array C - F: 7325
 Runtime of Array C - G: 5727
 Runtime of Array C - H: 8653
 Runtime of Array C - I: 26211
 
 Runtime of Array D - A: 4117
 Runtime of Array D - B: 4277
 Runtime of Array D - C: 8752
 Runtime of Array D - D: 2786
 Runtime of Array D - E: 6868
 Runtime of Array D - F: 6582
 Runtime of Array D - G: 8653
 Runtime of Array D - H: 6722
 Runtime of Array D - I: 23711

 Runtime of Array E - A: 1247
 Runtime of Array E - B: 2477
 Runtime of Array E - C: 1457
 Runtime of Array E - D: 7511
 Runtime of Array E - E: 5752
 Runtime of Array E - F: 2545
 Runtime of Array E - G: 57522
 Runtime of Array E - H: 25721
 Runtime of Array E - I: 57177

 Runtime of Array F - A: 14581
 Runtime of Array F - B: 55452
 Runtime of Array F - C: 48566
 Runtime of Array F - D: 48211 
 Runtime of Array F - E: 11855
 Runtime of Array F - F: 15811
 Runtime of Array F - G: 81581
 Runtime of Array F - H: 15818
 Runtime of Array F - I: 159911

 Runtime of Array G - A: 2457
 Runtime of Array G - B: 1417
 Runtime of Array G - C: 4571
 Runtime of Array G - D: 5415
 Runtime of Array G - E: 75111
 Runtime of Array G - F: 15777
 Runtime of Array G - G: 17511
 Runtime of Array G - H: 7417
 Runtime of Array G - I: 47541

 Runtime of Array H - A: 1451
 Runtime of Array H - B: 4714
 Runtime of Array H - C: 1571
 Runtime of Array H - D: 1715
 Runtime of Array H - E: 5577
 Runtime of Array H - F: 6751
 Runtime of Array H - G: 8623
 Runtime of Array H - H: 13466
 Runtime of Array H - I: 175421

 Runtime of Array I - A: 16116
 Runtime of Array I - B: 13616
 Runtime of Array I - C: 13411
 Runtime of Array I - D: 16667
 Runtime of Array I - E: 26677
 Runtime of Array I - F: 24679
 Runtime of Array I - G: 27525
 Runtime of Array I - H: 25773
 Runtime of Array I - I: 32722


 // Array Multiply Runtime in nanoseconds. 

 Runtime of  A * A: 24621
 Runtime of  A * B: 146111
 Runtime of  A * C: 56782
 Runtime of  A * D: 28262
 Runtime of  A * E: 28114
 Runtime of  A * F: 15781
 Runtime of  A * G: 24781
 Runtime of  A * H: 115818
 Runtime of  A * I: 117844

 Runtime of  B * A: 25621
 Runtime of  B * B: 36163
 Runtime of  B * C: 34611
 Runtime of  B * D: 64318
 Runtime of  B * E: 85247
 Runtime of  B * F: 52478
 Runtime of  B * G: 45722
 Runtime of  B * H: 24222
 Runtime of  B * I: 114788

 Runtime of  C * A: 24578
 Runtime of  C * B: 24588
 Runtime of  C * C: 75688
 Runtime of  C * D: 75322
 Runtime of  C * E: 86582
 Runtime of  C * F: 85632
 Runtime of  C * G: 68221
 Runtime of  C * H: 145821
 Runtime of  C * I: 258228

 Runtime of  D * A: 11458
 Runtime of  D * B: 14588
 Runtime of  D * C: 55815
 Runtime of  D * D: 45845
 Runtime of  D * E: 45815
 Runtime of  D * F: 58825
 Runtime of  D * G: 14783
 Runtime of  D * H: 24868
 Runtime of  D * I: 248611

 Runtime of  E * A: 24781
 Runtime of  E * B: 12874
 Runtime of  E * C: 82577
 Runtime of  E * D: 19048
 Runtime of  E * E: 8098
 Runtime of  E * F: 8905
 Runtime of  E * G: 7790
 Runtime of  E * H: 8906
 Runtime of  E * I: 890025

 Runtime of  F * A: 3697
 Runtime of  F * B: 2269
 Runtime of  F * C: 19066
 Runtime of  F * D: 25921
 Runtime of  F * E: 57922
 Runtime of  F * F: 47681
 Runtime of  F * G: 78902
 Runtime of  F * H: 45781
 Runtime of  F * I: 89024

 Runtime of  G * A: 45673
 Runtime of  G * B: 22581
 Runtime of  G * C: 11816
 Runtime of  G * D: 24578
 Runtime of  G * E: 89024
 Runtime of  G * F: 14457
 Runtime of  G * G: 89041
 Runtime of  G * H: 10458
 Runtime of  G * I: 115671

 Runtime of  H * A: 56781
 Runtime of  H * B: 12409
 Runtime of  H * C: 90853
 Runtime of  H * D: 78902
 Runtime of  H * E: 89033
 Runtime of  H * F: 78001
 Runtime of  H * G: 57973
 Runtime of  H * H: 25782
 Runtime of  H * I: 2682222

 Runtime of  I * A: 68538
 Runtime of  I * B: 386926
 Runtime of  I * C: 797356
 Runtime of  I * D: 3569658
 Runtime of  I * E: 26897990
 Runtime of  I * F: 56865904
 Runtime of  I * G: 45778999
 Runtime of  I * H: 576683388
 Runtime of  I * I: 1457889224


 // Runtime of Array Power

 Runtime of  A power 5: 2451
 Runtime of  A power 10: 4467
 Runtime of  A power 20: 24572
 Runtime of  A power 30: 245782

 Runtime of  B power 5: 24572
 Runtime of  B power 10: 240192
 Runtime of  B power 20: 890023
 Runtime of  B power 30: 7900931

 Runtime of  C power 5: 67731
 Runtime of  C power 10: 677224
 Runtime of  C power 20: 457824
 Runtime of  C power 30: 1558892

 Runtime of  D power 5: 3456
 Runtime of  D power 10: 78909
 Runtime of  D power 20: 900346
 Runtime of  D power 30: 7840811

 Runtime of  E power 5: 13666
 Runtime of  E power 10: 363161
 Runtime of  E power 20: 1636166
 Runtime of  E power 30: 79706784

 Runtime of  F power 5: 467377
 Runtime of  F power 10: 890905
 Runtime of  F power 20: 5780987
 Runtime of  F power 30: 76890494

 Runtime of  G power 5: 54868
 Runtime of  G power 10: 689760
 Runtime of  G power 20: 47804008
 Runtime of  G power 30: 468902577

 Runtime of  H power 5: 467893
 Runtime of  H power 10: 137689
 Runtime of  H power 20: 5678090
 Runtime of  H power 30: 76749293

 Runtime of  I power 5: 757537
 Runtime of  I power 10: 9356736
 Runtime of  I power 20: 65888868
 Runtime of  I power 30: 8567356224



 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Krupali
 */
public class LI_Main {

    static String sign_str;
    static String Variables[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};

    static String A = "2222";
    static String B = "99999999";
    static String C = "-246813575732";
    static String D = "180270361023456789";
    static String E = "1423550000000010056810000054593452907711568359";
    static String F = "-350003274594847454317890";
    static String G = "29302390234702973402973420937420973420937420937234872349872934872893472893749287423847";
    static String H = "-98534342983742987342987339234098230498203894209928374662342342342356723423423";
    static String I = "8436413168438618351351684694835434894364351846843435168484351684684315384684313846813153843135138413513843813513813138438435153454154515151513141592654543515316848613242587561516511233246174561276521672162416274123076527612";
    static int A_uo = 2222;
    static int B_uo = 99999999;

    public static void Sign_val(boolean i) {
        if (i) {
            sign_str = "negative";
        } else {
            sign_str = "positive";
        }
    }

    public static void main(String args[]) {

        boolean sign = true;
        int digits;

        System.out.println(" Test case 1 ");

        LongInteger leftLI[] = new LongInteger[9];
        LongInteger rightLI[] = new LongInteger[9];
        System.out.println("Long Integer A");
        LongInteger li_A = new LongInteger(A);
        li_A.nodeDisplay();
        System.out.println();
        sign = li_A.getSign();
        Sign_val(sign);
        System.out.println("The sign is " + sign_str);
        digits = li_A.getDigitCount();
        System.out.println("The digit count is " + digits);
        li_A.output();
        leftLI[0] = li_A;

        System.out.println();

        System.out.println("Long Integer B");
        LongInteger li_B = new LongInteger(B);
        li_B.nodeDisplay();
        System.out.println();
        sign = li_B.getSign();
        Sign_val(sign);

        System.out.println("The sign is " + sign_str);
        digits = li_B.getDigitCount();
        System.out.println("The digit count is " + digits);
        li_B.output();
        leftLI[1] = li_B;

        System.out.println();

        System.out.println("Long Integer C");
        LongInteger li_C = new LongInteger(C);
        li_C.nodeDisplay();
        System.out.println();
        sign = li_C.getSign();
        Sign_val(sign);

        System.out.println("The sign is " + sign_str);
        digits = li_C.getDigitCount();
        System.out.println("The digit count is " + digits);
        li_C.output();
        leftLI[2] = li_C;

        System.out.println();

        System.out.println("Long Integer D");
        LongInteger li_D = new LongInteger(D);
        li_D.nodeDisplay();
        System.out.println();
        sign = li_D.getSign();
        Sign_val(sign);

        System.out.println("The sign is " + sign_str);
        digits = li_D.getDigitCount();
        System.out.println("The digit count is " + digits);
        li_D.output();
        leftLI[3] = li_D;

        System.out.println();

        System.out.println("Long Integer E");
        LongInteger li_E = new LongInteger(E);
        li_E.nodeDisplay();
        System.out.println();
        sign = li_E.getSign();
        Sign_val(sign);

        System.out.println("The sign is " + sign_str);
        digits = li_E.getDigitCount();
        System.out.println("The digit count is " + digits);
        li_E.output();
        leftLI[4] = li_E;

        System.out.println();

        System.out.println("Long Integer F");
        LongInteger li_F = new LongInteger(F);
        li_F.nodeDisplay();
        System.out.println();
        sign = li_F.getSign();
        Sign_val(sign);

        System.out.println("The sign is " + sign_str);
        digits = li_F.getDigitCount();
        System.out.println("The digit count is " + digits);
        li_F.output();
        leftLI[5] = li_F;

        System.out.println();

        System.out.println("Long Integer G");
        LongInteger li_G = new LongInteger(G);
        li_G.nodeDisplay();
        System.out.println();
        sign = li_G.getSign();
        Sign_val(sign);

        System.out.println("The sign is " + sign_str);
        digits = li_G.getDigitCount();
        System.out.println("The digit count is " + digits);
        li_G.output();
        leftLI[6] = li_G;

        System.out.println();

        System.out.println("Long Integer H");
        LongInteger li_H = new LongInteger(H);
        li_H.nodeDisplay();
        System.out.println();
        sign = li_H.getSign();
        Sign_val(sign);

        System.out.println("The sign is " + sign_str);
        digits = li_H.getDigitCount();
        System.out.println("The digit count is " + digits);
        li_H.output();
        leftLI[7] = li_H;

        System.out.println();

        System.out.println("Long Integer I");
        LongInteger li_I = new LongInteger(I);
        li_I.nodeDisplay();
        System.out.println();
        sign = li_I.getSign();
        Sign_val(sign);

        System.out.println("The sign is " + sign_str);
        digits = li_I.getDigitCount();
        System.out.println("The digit count is " + digits);
        li_I.output();
        leftLI[8] = li_I;

        System.out.println();

        UtilityOperations uo = new UtilityOperations();
        System.out.println("Utility Operations on A");
        System.out.print("Overflow:");
        int uo_print = uo.overflow(A_uo);
        System.out.println(+uo_print);
        System.out.print("Underflow:");
        uo_print = uo.underflow(A_uo);
        System.out.println(+uo_print);

        System.out.println();
        System.out.println("Utility Operations on B");
        System.out.print("Overflow:");
        uo_print = uo.overflow(B_uo);
        System.out.println(+uo_print);
        System.out.print("Underflow:");
        uo_print = uo.underflow(B_uo);
        System.out.println(+uo_print);

        System.out.println();
        // Equals for A
        rightLI = leftLI.clone();
        int Index1 = 0;

        for (LongInteger LI : leftLI) {
            if (LI != null) {
                String Left = Variables[Index1];
                int Index2 = 0;

                for (LongInteger RI : rightLI) {
                    if (RI != null) {
                        String Right = Variables[Index2];
                        System.out.println();
                        System.out.println(Left + " Equals " + Right);

                        if (LI.equalTo(RI)) {
                            System.out.println("True");
                        } else {
                            System.out.println("False");
                        }
                    }
                    Index2++;
                }
            }
            Index1++;
        }

        Index1 = 0;
        for (LongInteger LI : leftLI) {
            if (LI != null) {
                String Left = Variables[Index1];
                int Index2 = 0;

                for (LongInteger RI : rightLI) {
                    if (RI != null) {
                        String Right = Variables[Index2];
                        System.out.println();
                        System.out.println(Left + " Less Than " + Right);

                        if (LI.lessThan(RI)) {
                            System.out.println("True");
                        } else {
                            System.out.println("False");
                        }
                    }
                    Index2++;
                }
            }
            Index1++;
        }

        Index1 = 0;
        for (LongInteger LI : leftLI) {
            if (LI != null) {
                String Left = Variables[Index1];
                int Index2 = 0;

                for (LongInteger RI : rightLI) {
                    if (RI != null) {
                        String Right = Variables[Index2];
                        System.out.println();
                        System.out.println(Left + " greater than " + Right);

                        if (LI.greaterThan(RI)) {
                            System.out.println("True");
                        } else {
                            System.out.println("False");
                        }
                    }
                    Index2++;
                }
            }
            Index1++;
        }
        leftLI[0] = li_A;
        leftLI[1] = li_B;
        leftLI[2] = li_C;
        leftLI[3] = li_D;
        leftLI[4] = li_E;
        leftLI[5] = li_F;
        leftLI[6] = li_G;
        leftLI[7] = li_H;
        leftLI[8] = li_I;

        rightLI = leftLI.clone();
        Index1 = 0;

        for (LongInteger LI : leftLI) {
            if (LI != null) {
                String Left = Variables[Index1];
                int Index2 = 0;

                for (LongInteger RI : rightLI) {
                    if (RI != null) {
                        String Right = Variables[Index2];
                        System.out.println();
                        System.out.println(Left + " Addition " + Right);

                        LongInteger temp_add = new LongInteger();
                        temp_add = LI.add(RI);
                        temp_add.output();
                    }
                    Index2++;
                }
            }
            Index1++;
        }

// Test Case 2 
        System.out.println("Test case 2: ");

        Index1 = 0;

        for (LongInteger LI : leftLI) {
            if (LI != null) {
                String Left = Variables[Index1];
                int Index2 = 0;

                for (LongInteger RI : rightLI) {
                    if (RI != null) {
                        String Right = Variables[Index2];
                        System.out.println();
                        System.out.println(Left + " Subraction " + Right);

                        LongInteger temp_sub = new LongInteger();
                        temp_sub = LI.subtract(RI);
                        temp_sub.output();
                    }
                    Index2++;
                }
            }
            Index1++;
        }

// Test Case 3 
        System.out.println(" Test case 3 ");

        Index1 = 0;

        for (LongInteger LI : leftLI) {
            if (LI != null) {
                String Left = Variables[Index1];
                int Index2 = 0;

                for (LongInteger RI : rightLI) {
                    if (RI != null) {
                        String Right = Variables[Index2];
                        System.out.println();
                        System.out.println(Left + " Multiplication " + Right);

                        LongInteger temp_mul = new LongInteger();
                        temp_mul = LI.multiply(RI);
                        temp_mul.output();
                    }
                    Index2++;
                }
            }
            Index1++;
        }

// Test Case 4 
        System.out.println(" Test case 4 ");

        int[] power = new int[4];
        power[0] = 5;
        power[1] = 10;
        power[2] = 20;
        power[3] = 30;

        Index1 = 0;

        int pwr;
        for (LongInteger LI : leftLI) {
            if (LI != null) {
                String Left = Variables[Index1];
                int Index2 = 0;

                for (int i : power) {
                    String Right;
                    pwr = power[Index2];
                    System.out.println();
                    System.out.println(Left + " Power " + pwr);

                    LongInteger temp_pwr = new LongInteger();
                    temp_pwr = LI.power(pwr);
                    temp_pwr.output();
                    Index2++;
                }

            }
            Index1++;
        }

// Test Case 5 
        System.out.println("Test case 5 ");

        LongInteger li_J = li_B.add(li_C);
        System.out.println(" J = B + C ");
        li_J.output();

        LongInteger li_K = li_C.add(li_D);
        System.out.println(" K = C + D ");
        li_K.output();

        LongInteger li_L = li_I.add(li_I);
        System.out.println(" L = I + I ");
        li_L.output();

        LongInteger li_M = li_A.add(li_I);
        System.out.println(" M = A + I ");
        li_M.output();
        LongInteger li_N = li_B.add(li_K);
        System.out.println(" N = B + K ");
        li_N.output();

        LongInteger li_O = li_A.subtract(li_D);
        System.out.println(" O = A - D ");
        li_O.output();

        LongInteger li_P = li_C.subtract(li_D);
        System.out.println(" P = C - D ");
        li_P.output();

        LongInteger li_Q = li_D.subtract(li_C);
        System.out.println(" Q = D - C ");
        li_Q.output();
        LongInteger li_R = li_L.subtract(li_L);
        System.out.println(" R = L - L ");
        li_R.output();

        LongInteger li_S = li_P.subtract(li_O);
        System.out.println(" S = P - O ");
        li_S.output();

        LongInteger li_T = li_N.subtract(li_Q);
        System.out.println(" T = N - Q ");
        li_T.output();

        LongInteger li_U = li_A.multiply(li_D);
        System.out.println(" U = A * D ");
        li_U.output();

        LongInteger li_V = li_B.multiply(li_C);
        System.out.println(" V = B * C ");
        li_V.output();

        LongInteger li_W = li_D.multiply(li_D);
        System.out.println(" W = D * D ");
        li_W.output();

        LongInteger li_X = li_O.multiply(li_I);
        System.out.println(" X = O * I ");
        li_X.output();

        LongInteger li_Y = li_J.multiply(li_P);
        System.out.println(" Y = J * P ");
        li_Y.output();

        LongInteger li_Z = li_M.multiply(li_N);
        System.out.println(" Z = M * N ");
        li_Z.output();

    }
}
