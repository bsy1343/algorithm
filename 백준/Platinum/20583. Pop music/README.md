# [Platinum I] Pop music - 20583

[문제 링크](https://www.acmicpc.net/problem/20583)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 61, 정답: 19, 맞힌 사람: 14, 정답 비율: 35.897%

### 분류

다이나믹 프로그래밍, 수학

### 문제 설명

<p>Radewoosh loves pop music. It is relaxing, it is great to dance to and even helps in programming. All these advantages, however, require a good tune of the melody with the beat. In Polish, &quot;bit&quot; and &quot;beat&quot; are the same word, and then the statement is more entertaining, but that doesn&#39;t make that much sense in English. Sorry!</p>

<p>Radewoosh has just created a new melody and is going to match some good beats to it. The melody lasts $n$ seconds and some of its moments can be much better than others. The quality of the $i$-th second of the melody is described by the integer $a_i$ (possibly negative). He needs to select the non-negative integers $b_i$ -- beat gain coefficients. The coefficient strengthens the second $C(b_i)$-fold, where $C(b_i)$ is the number of <em>ones</em> in binary representation of $b_i$. For example, choosing $b_i = 13$ gives you a threefold gain of $i$-th second of the melody, because the binary representation of $13$ is <code>1101</code> and it contains three <em>ones</em>.</p>

<p>The final quality of the entire song can be described as: $$a_1 \cdot C(b_1) + a_2 \cdot C(b_2) + \ldots + a_n \cdot C(b_n).$$</p>

<p>Everyone likes songs with the increasing beat gain and Radewoosh is no exception. The beat gain coefficients must form an increasing sequence of non-negative integers with a certain upper limit of $m$: $$0 \le b_1 &lt; b_2 &lt; \ldots &lt; b_n \le m.$$</p>

<p>Radewoosh&#39;s goal is to choose beat gain coefficients to maximize the final quality of the song.</p>

<p>What is the greatest value he can get?</p>

### 입력

<p>The first line of the standard input contains two integers $n, m$ ($1\le n \le 200, n - 1 \le m \le 10^{18}$) -- the length of the song in seconds and the upper limit for the beat gain coefficients.</p>

<p>The second line contains $N$ integers &nbsp;$a_1, \ldots, a_n$ ($-10^{14} \le a_i \le 10^{14}$) denoting the quality of the corresponding seconds of the melody.</p>

### 출력

<p>The output should contain one integer -- the maximum possible final quality of the song.</p>

### 힌트

<p><strong>Explanation to the first example:</strong> The melody consists of three seconds with qualities $2, -1, 3$ respectively. Note that the quality of the second may be negative! The optimal sequence $b$ is $b_1=3$, $b_2=4$, $b_3=5$. Then we get the following quality of the song: $$a_1 \cdot C(b_1) + a_2 \cdot C(b_2) + a_3 \cdot C(b_3) = 2 \cdot C(3) + (-1) \cdot C(4) + 3 \cdot C(5) = 2 \cdot 2 + (-1) \cdot 1 + 3 \cdot 2 = 9$$</p>