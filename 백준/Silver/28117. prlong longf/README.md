# [Silver I] prlong longf - 28117

[문제 링크](https://www.acmicpc.net/problem/28117)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 646, 정답: 300, 맞힌 사람: 267, 정답 비율: 50.188%

### 분류

수학, 다이나믹 프로그래밍, 문자열

### 문제 설명

<p>성서는 <strong><span style="color:#ad5600;">Bronze 5</span></strong> 난이도의 문제를 풀다가 <span class="result-text result-wa " data-color="wa">틀렸습니다</span>를 받았다.</p>

<p>계산 도중 수가 너무 커져서 오버플로우가 발생했다고 생각한 성서는 코드 에디터의 &ldquo;찾기 및 바꾸기&rdquo; 기능을 사용해서 코드의 <code>int</code>를 모두 동시에 <code>long long</code>으로 바꾸었는데, <code>printf</code>도 모두 <code>prlong longf</code>로 바뀌는 사고가 일어났다!</p>

<pre>
<code>#include &lt;stdio.h&gt;

long long main(){
    long long n, res = 1;
    scanf(&quot;%d&quot;, &amp;n);
    for(long long i = 1; i &lt;= n; i++){
        res *= i;
    }
    prlong longf(&quot;%d\n&quot;, res);
    return 0;
}</code></pre>

<p>스스로 코드를 고치기 귀찮았던 성서는 대회 참가자들에게 바뀐 코드를 주고 초기 상태로 복원해 달라고 부탁하려고 했지만, 주어진 코드에 따라 복원 방법이 유일하지 않을 수 있다는 사실을 깨달았다. 좋은 문제 아이디어를 발견한 성서는 2023 SCON에 다음과 같은 문제를 출제했다.</p>

<p>모든 <code>int</code>가 <code>longlong</code>으로 바뀐 문자열이 주어진다. 가능한 원래 문자열은 모두 몇 가지인가?</p>

### 입력

<p>첫째 줄에 바뀐 문자열의 길이 $N$이 주어진다.</p>

<p>둘째 줄에 <code>int</code>가 모두 <code>longlong</code>으로 바뀐 길이 $N$의 문자열이 주어진다.</p>

### 출력

<p>문자열의 초기 상태로 가능한 경우의 수를 출력한다.</p>

### 제한

<ul>
	<li>$1\leq N\leq 80$</li>
	<li>주어진 문자열의 모든 문자는 알파벳 소문자이고, 공백을 포함하지 않는다.</li>
	<li>주어진 문자열은 <code>int</code>를 부분 문자열로 갖지 않는다.</li>
</ul>