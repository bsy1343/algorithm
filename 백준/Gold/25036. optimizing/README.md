# [Gold II] optimizing - 25036

[문제 링크](https://www.acmicpc.net/problem/25036)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 8, 맞힌 사람: 8, 정답 비율: 53.333%

### 분류

이분 탐색, 수학

### 문제 설명

<p>Write a function <u><code>optimizing</code></u>:</p>

<ul>
	<li>input parameter: an <code>int</code>-type object <code>n</code> satisfying $0\le$<code>n</code>$&lt;2^{63}$</li>
	<li>return value: the <code>int</code>-type object <code>f(n)</code> where <code>f</code> is the following Python function:</li>
</ul>

<pre>
def f(n):
    assert type(n)==int and n&gt;=0
    g=lambda n:sum([x**3 for x in range(n)])
    x=&quot;&quot;
    k=0
    while n&gt;=len(x):
        x+=str(g(k))
        k+=1
    return int(x[n])</pre>

### 입력



### 출력

