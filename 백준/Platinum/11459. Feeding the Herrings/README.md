# [Platinum II] Feeding the Herrings - 11459

[문제 링크](https://www.acmicpc.net/problem/11459)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 35, 정답: 14, 맞힌 사람: 11, 정답 비율: 39.286%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 자릿수를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Zookeper Willy is feeding herrings today. He is feeding them to seals, as they are their preferred food. There are three separate pools in which the seals live. The ZOO is a modern institution and it demands their employees to keep track of feeding habits of animals. There is a touchscreen installed at the seals pools and Willy has to enter the number of herrings which he is going to deposit into each of the three pools. Unfortunately, the screen is not working properly - in particular, it is impossible to enter the digit &lsquo;3&rsquo;.</p>

<p>Willy called the chief marine mammals zookeper and asked for help.</p>

<p>&ldquo;That is OK,&rdquo; said the chief, &ldquo;just distribute the herrings in such a way that the number of herrings which go into each pool does not contain the digit &lsquo;3&rsquo;.&rdquo;</p>

<p>&ldquo;But there is a lower limit L on the number of herrings which have to be put into each pool,&rdquo; reacted Willy, &ldquo;I might not be able to find a suitable division.&rdquo;</p>

<p>&ldquo;You will be able to find a suitable division,&rdquo; assured him the chief, &ldquo;considering the numbers of herrings in the bucket, there should be zillions of possible divisions.&rdquo;</p>

<p>&ldquo;Well, exactly how many?&rdquo; wondered Willy for himself.</p>

<p>You will be given the total number N of herrings which are to be deposited into the seals pools and the lower limit L on the number of herrings in each of the pools. Find out in how many ways might these N herrings be placed into the pools in such a way that the number of herrings in each pool does not contain digit &lsquo;3&rsquo; in its decimal representation. In this problem, we do not distinguish between individual herrings as they are all more or less of the same size and nutrition value. We do distinguish between the pools, though, because they are populated by different groups of seals. Also, we suppose that no herring can be divided into pieces.</p>

### 입력

<p>There are more test cases. Each case consists of a single line containing two integers N, L (1 &le; N &le; 10<sup>10 000</sup>, 1 &le; L &le; N/3) separated by space and representing the number of herrings in the bucket and the lower limit on the number of herrings which have to be deposited in each of the pools. The input is terminated by a line with two zeros.</p>

### 출력

<p>For each test case print on a separate line the number of possible divisions of the herrings into the three given pools. Express the result modulo 12345647.</p>