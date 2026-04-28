# [Platinum III] Pizza - 19749

[문제 링크](https://www.acmicpc.net/problem/19749)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 9, 맞힌 사람: 7, 정답 비율: 38.889%

### 분류

비트마스킹, 비트 집합, 포함 배제의 원리

### 문제 설명

<p>Vasya is going to bake a pizza for $m$ friends. There are $n$ additional ingredients at Vasya&#39;s disposal, each of which can either be put into pizza or not. Vasya may use all ingredients or even prepare a pizza without additional ingredients at all. Thus, there are $2^n$ possible pizza recipes.</p>

<p>Not just any pizza will make Vasya&#39;s friends happy, though. Every friends prepared a wish list of the form &quot;ingredient $t$ should be included into the pizza&quot; or &quot;ingredient $t$ shouldn&#39;t be included into the pizza&quot;. Vasya&#39;s friends aren&#39;t too choosy: any pizza which has at least one of friend&#39;s wishes satisfied will make the friend happy.</p>

<p>Calculate the number of ways Vasya can bake the pizza to make all friends happy. Since this number may be too large, output it modulo $998244353$.</p>

### 입력

<p>The first line of the input contains two integers $n$ and $m$ --- the number of ingredients and the number of Vasya&#39;s friends, respectively ($1 \le n \le 1000$, $1 \le m \le 20$).</p>

<p>Each of the next $m$ lines corresponds to one of Vasya&#39;s friend and contains an integer $a_i$ --- the number of wishes on the wish list, followed by $a_i$ integers $b_{i,j}$ --- the description of wishes on the list ($1 \le a_i \le 100$, $-n \le b_{i,j} \le n$, $b_{i,j} \neq 0$). If $b_{i,j}$ is positive, the $i$-th friend has a wish &quot;ingredient $b_{i,j}$ should be included into the pizza&quot;, if it&#39;s negative, the $i$-th friend has a wish &quot;ingredient $-b_{i,j}$ shouldn&#39;t be included into the pizza&quot;.</p>

<p>Every ingredient occurs at most once in every list.</p>

### 출력

<p>Output the number of different pizzas making all friends happy, modulo $998244353$.</p>

### 힌트

<p>In the first example, the following sets of ingredients will make all friends happy: $(1)$, $(3)$, $(1, 3)$, $(1, 4)$, $(1, 3, 4)$.</p>

<p>In the second example, ingredient $42$ shouldn&#39;t be included into the pizza, while all the other ingredients may be either included or not. The answer is equal to $2^{67}$ modulo $998244353$.</p>