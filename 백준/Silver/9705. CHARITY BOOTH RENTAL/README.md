# [Silver III] CHARITY BOOTH RENTAL - 9705

[문제 링크](https://www.acmicpc.net/problem/9705)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 73, 정답: 41, 맞힌 사람: 33, 정답 비율: 53.226%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>The Kajang Municipal Council is organising a fundraising event to raise money for charity. The council plans to provide booth spaces for rent to government agencies (GA), private companies (PC) and the general public (GP) who wish to participate in that event. The organiser has decided to allocate booth spaces as follows:</p>

<p>0 &lt; booth spaces for GP &lt; booth spaces for GA &lt; booth spaces for PC</p>

<p>As an example, for 10 booth spaces, the following allocations are possible</p>

<p>GP =1, GA =2, PC =7<br />
GP =1, GA =3, PC =6<br />
GP =1, GA =4, PC =5<br />
GP =2, GA =3, PC =5</p>

<p>Write a program to calculate the number of possible allocations given the number of booth spaces.</p>

### 입력

<p>Each case is the number of booth spaces T where 6 &lt;= T &lt;= 1000000. The input is terminated with a 0.&nbsp;</p>

### 출력

<p>For each test case, the output contains a line in the format Case #x: M, where x is the case number (starting from 1) and M is the number of booth spaces and the answer with a colon (&#39;:&#39;) separating them. The output for each case must be printed on a separate line.</p>