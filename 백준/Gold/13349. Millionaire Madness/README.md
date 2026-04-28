# [Gold IV] Millionaire Madness - 13349

[문제 링크](https://www.acmicpc.net/problem/13349)

### 성능 요약

시간 제한: 20 초, 메모리 제한: 512 MB

### 통계

제출: 209, 정답: 131, 맞힌 사람: 117, 정답 비율: 62.567%

### 분류

그래프 이론, 그래프 탐색, 이분 탐색, 최단 경로, 데이크스트라

### 문제 설명

<p>A close friend of yours, a duck with financial problems, has requested your help with a matter&nbsp;that will help him pay off his debts. He is the nephew of an extremely wealthy duck, who&nbsp;has a large vault, filled with mountains of coins. This wealthy duck has a certain coin in his&nbsp;possession which has a lot of sentimental value to him. Usually, it is kept under a protective&nbsp;glass dome on a velvet cushion.</p>

<p>However, during a recent relocating of the coins in the vault, the special coin was accidentally&nbsp;moved into the vault, leading to an extremely stressful situation for your friend&rsquo;s uncle.&nbsp;Luckily, the coin has recently been located. Unfortunately, it is completely opposite to the&nbsp;entrance to the vault, and due to the mountains of coins inside the vault, actually reaching&nbsp;the coin is no simple task.</p>

<p>He is therefore willing to pay your friend to retrieve this coin, provided that he brings his own&nbsp;equipment to scale the mountains of coins. Your friend has decided he will bring a ladder, but&nbsp;he is still uncertain about its length. While a longer ladder means that he can scale higher&nbsp;cliffs, it also costs more money. He therefore wants to buy the shortest ladder such that he&nbsp;can reach the special coin, so that he has the largest amount of money left to pay off his&nbsp;debts.</p>

<p>The vault can be represented as a rectangular grid of stacks of coins of various heights (in&nbsp;meters), with the entrance at the north west corner (the first height in the input, the entrance&nbsp;to the vault is at this height as well) and the special coin at the south east corner (the last&nbsp;height in the input). Your avian companion has figured out the height of the coins in each&nbsp;of these squares. From a stack of coins he can attempt to climb up or jump down to the&nbsp;stack immediately north, west, south or east of it. Because your friend cannot jump or fly&nbsp;(he is a very special kind of duck that even wears clothes), successfully performing a climb of&nbsp;n meters will require him to bring a ladder of at least n meters. He does not mind jumping&nbsp;down, no matter the height; he just lets gravity do all the work.</p>

### 입력

<p>The first line contains two integers: the length M, and the width N of the vault, satisfying&nbsp;1 &le; M, N &le; 1000.</p>

<p>The following M lines each contain N integers. Each integer specifies the height of the pile&nbsp;of coins in the vault at the corresponding position. (The first line describes the north-most&nbsp;stacks from west to east; the last line describes the south-most stacks from west to east). The&nbsp;heights are given in meters and all heights are at least 0 and at most 10<sup>9&nbsp;</sup>(yes, your friend&rsquo;s&nbsp;uncle is very rich).</p>

### 출력

<p>Output a single line containing a single integer: the length in meters of the shortest ladder&nbsp;that allows you to get from the north west corner to the south east corner.</p>