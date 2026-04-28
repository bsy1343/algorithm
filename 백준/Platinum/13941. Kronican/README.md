# [Platinum V] Kronican - 13941

[문제 링크](https://www.acmicpc.net/problem/13941)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 32 MB

### 통계

제출: 224, 정답: 103, 맞힌 사람: 87, 정답 비율: 46.277%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Little Mislav owns N glasses of infinite volume, and each glass contains some water. Mislav wants to drink all the water, but he doesn&rsquo;t want to drink from more than K glasses. What Mislav can do with the glasses is pour the total volume of water from one glass to another.</p>

<p>Unfortunately, it matters to Mislav what glass he picks, because not all glasses are equally distant to him. More precisely, the amount of effort it takes to pour water from glass labeled with i to glass labeled j is denoted with C<sub>ij</sub>.</p>

<p>Help Mislav and find the order of pouring the water from one glass to another such that the sum of effort is minimal.&nbsp;</p>

### 입력

<p>The first line of input contains integers N, K (1 &le; K &le; N &le; 20).</p>

<p>The following N lines contains N integers C<sub>ij</sub> (0 &le; C<sub>ij</sub> &le; 10<sup>5</sup> ). The ith row and jth column contains value C<sub>ij</sub> . It will hold that each Cii is equal to 0.&nbsp;</p>

### 출력

<p>Output the minimal effort needed for Mislav to achieve his goal.&nbsp;</p>

### 힌트

<p>&nbsp;​Mislav doesn&rsquo;t need to pour water in order to drink from at most 3 glasses.&nbsp;</p>