# [Platinum III] SABOR - 10614

[문제 링크](https://www.acmicpc.net/problem/10614)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 14, 정답: 9, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

구현, 그리디 알고리즘, 애드 혹, 해 구성하기, 무작위화

### 문제 설명

<p>A land far, far away has N Members of Parliament (MP). They had a turbulent and passionate debate on the law on amendments to the law on a new referendum on referendums. From Monday to Friday, all MPs joyfully came to work and argued all day.</p>

<p>A diligent news reporter photographed MPs at their workplace in the heat of the argument every working day of the week. What she captured on the photos are pairs of MPs fighting and scowling at each other. The five photographs have been forwarded to you for thorough analysis.</p>

<p>It is a fact that each MP belongs to one of the two political parties. Let&rsquo;s denote them with letters A and B. Your task is to estimate which MP belongs to which party, so that the following holds for your estimation: each MP argued with at most two distinct members of their own party.</p>

### 입력

<p>The first line of input contains an integer N (2 &le; N &le; 200 000), the number of MPs. MPs are denoted with numbers from 1 to N.</p>

<p>The following five lines describe the photographs taken from Monday to Friday. Each of the five lines contains the list of pairs of MPs that are arguing on the photograph that day (scowling at each other). Stated first is the number of pairs P (1 &le;&nbsp;P &le; N/2), followed by P pairs in the form of &ldquo;K L&rdquo;, where K and L are labels of MPs scowling at each other. Before each pair there is a double space. Of course, each MP is stated at most once per line.</p>

### 출력

<p>The first and only line of output must contain an array consisting of only characters A and B, so that the Kth character denotes the party of Kth MP in a division that satisfies the given conditions.</p>

<p>Since the solution isn&rsquo;t going to be unique, output any.</p>