# [Gold IV] if 2 - 15550

[문제 링크](https://www.acmicpc.net/problem/15550)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1697, 정답: 834, 맞힌 사람: 725, 정답 비율: 53.823%

### 분류

애드 혹

### 문제 설명

<p>다음 프로그램을 실행시켰을 때, &quot;<code>true</code>&quot;를 출력하는 변수 <code>a, b, c</code>의 자료형과 값을 찾는 프로그램을 작성하시오.</p>

<pre class="brush:c++; toolbar:false;">
#include &lt;iostream&gt;
using namespace std;
int main() {
    ??? a = ???;
&nbsp;   ??? b = ???;
&nbsp;   ??? c = ???;
    if (a == b &amp;&amp; b == c &amp;&amp; c != a) {
        cout &lt;&lt; &quot;true&quot; &lt;&lt; &#39;\n&#39;;
    } else {
        cout &lt;&lt; &quot;false&quot; &lt;&lt; &#39;\n&#39;;
    }
    return 0;
}</pre>

<p>실행 환경은 BOJ 채점 서버의 C++17 실행 환경과&nbsp;같다.</p>

### 입력

<p>입력은 없다.</p>

### 출력

<p>첫째 줄에 변수 <code>a</code>의 자료형과 값, 둘째 줄에&nbsp;변수 <code>b</code>의 자료형과 값, 셋째 줄에&nbsp;변수 <code>c</code>의 자료형과 값을 공백으로 구분해 출력한다. 자료형은 <code>int</code>,&nbsp;<code>long long</code>,&nbsp;<code>float</code>,&nbsp;<code>double</code>만 가능하다. 출력한 값이 자료형에 알맞지 않은 경우에는 틀리게 된다.</p>

<p>값은 아래 소스가 런타임 에러 없이 읽을 수 있는 값을 의미한다.</p>

<pre class="brush:c++; toolbar:false;">
istringstream sin(line);
자료형 temp;
assert(sin &gt;&gt; temp);</pre>

### 힌트

<p>예제는 문제의 정답이 아니다.</p>