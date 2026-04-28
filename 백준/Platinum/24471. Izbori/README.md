# [Platinum I] Izbori - 24471

[문제 링크](https://www.acmicpc.net/problem/24471)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 58, 정답: 19, 맞힌 사람: 14, 정답 비율: 29.167%

### 분류

자료 구조, 수학, 세그먼트 트리, 제곱근 분할법

### 문제 설명

<p>Mr. Malnar is running for mayor of the Tompojevci county. The Tompojevci county consists of a single village (called Tompojevci), made up of a row of $n$ houses labeled with integers from 1 to $n$. In each house there is one resident, but more importantly for Mr. Malnar, a voter. Mr. Malnar knows that the election isn&rsquo;t won by the best candidate, but by the candidate who hosts the best banquet before the election. Therefore, a few days before the election he will organize a banquet. He&rsquo;ll invite all residents of the village who live at houses whose number is between $l$ and $r$ ($l &le; r$) inclusive and prepare a delicious meal for them.</p>

<p>Mr. Malnar knows all the residents of Tompojevci very well so he knows what the favourite dish of each resident is. That&rsquo;s why for the banquet he&rsquo;ll prepare the meal that is the favourite of the majority of the invited people. However, only the people that get their favourite meal will vote for Mr. Malnar, while the rest will vote for the only other candidate, Mr. Vlado. To win the election, Mr. Malnar needs to get strictly more than half of the votes from the people that voted. The residents that weren&rsquo;t invited to the banquet will forget about the election and are not going to vote.</p>

<p>Mr. Malnar now wants to know how many different ways there are for him to choose the numbers $l$ and $r$ so that he wins the election.</p>

### 입력

<p>The first line contains a positive integer $n$ ($1 &le; n &le; 200\,000$) from the problem statement.</p>

<p>The second line contains $n$ positive integers $a_i$ ($1 &le; a_i &le; 10^9$) each representing the favourite dish of the resident at house $i$.</p>

### 출력

<p>In the only line print the number of different ways for Mr. Malnar to choose the numbers $l$ and $r$ so that he wins the election.</p>

### 힌트

<p>Clarification of the second example: The possible choices for ($l$, $r$) are: (1, 1),(2, 2),(3, 3),(1, 3).</p>