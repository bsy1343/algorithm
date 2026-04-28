# [Gold II] 유니온 파인드 복원 - 22996

[문제 링크](https://www.acmicpc.net/problem/22996)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 459, 정답: 131, 맞힌 사람: 96, 정답 비율: 26.966%

### 분류

해 구성하기, 자료 구조, 분리 집합, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>준원이는 스타팅 포인트의 멤버이다. 준원이는 회사에서 병합 (merge) 연산을 수행할 때마다 포인트를 얻는다.</p>

<p>그래서 준원이는 C언어로&nbsp;다음과 같은 코드를 작성했다.</p>

<pre>
#include &lt;stdio.h&gt;

int par[300001];
int find(int v) {
    if (v == par[v]) return v;
    return par[v] = find(par[v]);
}
void merge(int u, int v){
    u = find(u);
    v = find(v);
    if (u != v) par[u] = v;
}

int main() {
    int N, Q;
    scanf(&quot;%d %d&quot;, &amp;N, &amp;Q);
    for (int i=1; i&lt;=N; i++) par[i] = i;

    for (int i=1; i&lt;=Q; i++) {
        int type;
        scanf(&quot;%d&quot;, &amp;type);
        if(type == 1) {
            int u, v;
            scanf(&quot;%d %d&quot;, &amp;u, &amp;v);
            merge(u, v);
        }
        else if(type == 2) {
            int v;
            scanf(&quot;%d&quot;, &amp;v);
            printf(&quot;%d\n&quot;, find(v));
        }
    }
}</pre>

<p>준원이는 위&nbsp;코드로 다음 문제를 풀었다.</p>

<blockquote>
<p>$1$부터 $N$까지 $N$개의 자연수를 원소로 가지는&nbsp;$N$개의 집합 $\{1\},&nbsp;\{2\}, \cdots&nbsp;, \{N\}$이 있다.</p>

<p>여러분은 아래와 같이&nbsp;주어지는&nbsp;질의를 순서대로 $Q$개 처리해야 한다.</p>

<ul>
	<li>1번 질의: <code>1 u v</code> 의 형식으로&nbsp;주어진다. 원소&nbsp;$u$가 속한 집합과 원소&nbsp;$v$가 속한 집합이 다르다면, 두 집합을 하나로 합친다.</li>
	<li>2번 질의: <code>2 v</code> 의 형식으로&nbsp;주어진다.&nbsp;원소&nbsp;$v$가 속한 집합에 있는 원소를 아무거나 하나 반환한다.</li>
</ul>
</blockquote>

<p>그런데, 문제가 생겼다. 준원이는 어떤 입력 데이터를 받았는지 까먹었다. 하지만 주어진 $N, Q$ 값과, 2번 질의들이&nbsp;반환한 값들, 그리고 실행 결과&nbsp;최종 상태에서의 <code>par[]</code> 배열의 값들은 기억하고&nbsp;있다.</p>

<p>이 정보를 이용해&nbsp;어떤 입력 데이터가&nbsp;주어졌을지 복원해보자.</p>

### 입력

<p>첫째 줄에 준원이가 기억하는 원소의 개수 $N$과 질의의 개수&nbsp;$Q$가 공백으로 구분되어 주어진다.</p>

<p>둘째 줄에 실행 결과 최종 상태에서의 <code>par[]</code>&nbsp;배열의 값들을 의미하는 $N$개의 자연수가 공백으로 구분되어 주어진다.</p>

<p>셋째 줄에 입력 데이터에서 주어진 2번 질의의 개수 $M$이 주어진다.</p>

<p>넷째 줄부터 $M$개의 줄에 걸쳐, 준원이의 코드가 2번 질의들이 반환한 값들이 한 줄에 하나씩 순서대로 주어진다.</p>

### 출력

<p>준원이의 프로그램이 받았을&nbsp;입력&nbsp;데이터를 아래와 같은 형식으로 복원하여 출력한다.</p>

<p>첫째 줄에 원소의 개수 $N$과&nbsp;질의의 개수 $Q$를 공백으로 구분하여 출력한다.</p>

<p>둘째 줄부터 $Q$개의 줄에 걸쳐, 질의를 한 줄에 하나씩 순서대로 출력한다.</p>

<ul>
	<li>1번 질의: <code>1 u v</code>&nbsp;의 형식으로 출력한다.</li>
	<li>2번 질의: <code>2 v</code> 의 형식으로&nbsp;출력한다.</li>
</ul>

<p>준원이가 기억하는 정보와&nbsp;일치하는 입력 데이터가 여러 가지 있으면 아무거나 출력해도 된다.</p>

### 제한

<ul>
	<li>$1 \leq N&nbsp;\leq 300\,000$</li>
	<li>$1 \leq M \leq Q \leq 300\,000$</li>
	<li>1번 질의에서 $1 \leq u, v \leq N$</li>
	<li>1번 질의에서 $u, v$는 같을 수 있다.</li>
	<li>2번 질의에서 $1 \leq v \leq N$</li>
	<li>준원이가 기억하는 정보와 일치하는&nbsp;입력 데이터가&nbsp;존재한다.</li>
</ul>