# [Platinum I] 딸기당근수박참외메론게임 - 15716

[문제 링크](https://www.acmicpc.net/problem/15716)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 318, 정답: 47, 맞힌 사람: 22, 정답 비율: 13.665%

### 분류

수학, 구현, 이분 탐색, 매개 변수 탐색

### 문제 설명

<blockquote>
<p>디디가 좋아하는 랜덤게임 ~! 무슨 게임~! 게임 스타트 !!</p>

<p>딸기당근수박참외메론게임♪</p>
</blockquote>

<p>디디대학에서의 딸기당근수박참외메론게임의 룰은 다음과 같은 규칙으로 진행된다.</p>

<ol>
	<li>게임에 쓰일 단어의 수 n과 박자 수 b를 정한다. 단, 박자수는 단어의 수보다 크거나 같아야 하며, 같은 단어가 여러 번 들어갈 수 있다.</li>
	<li>앞서 정한 n만큼, 사용할 단어(S<sub>1</sub>, S<sub>2</sub>, ..., S<sub>n</sub>)를 정한다.</li>
	<li>각 i(1, 2, ...) 차례마다 단어들을 아래 코드와 같은 결과로 말해야 한다.</li>
</ol>

<pre class="brush:c++; toolbar:false;">
if(b == 1) printf(&quot;%s&quot;, S[1]);
else {
    if ((i - 1) % (2 * (b - 1)) + 1 &lt; b) {
        for (int j = 1; j &lt;= (i - 1) % (b - 1) + 1; j++) printf(&quot;%s &quot;, S[(j - 1) % n + 1]);
    }
    else {
        for (int j = 1; j &lt;= b - ((i - 1) % (b - 1)); j++)
            printf(&quot;%s &quot;, S[(j - 1) % n + 1]);
    }
}
</pre>

<p>단어 집합 S는 번호가 1부터 시작됨에 유의하라.</p>

<p>예를 들어, n은 3, b는 5, 집합&nbsp;S = {king, god, gd}일 때,</p>

<ul>
	<li>king</li>
	<li>king god</li>
	<li>king god gd</li>
	<li>king god gd king</li>
	<li>king god gd king god</li>
	<li>king god gd king</li>
	<li>king god gd</li>
	<li>king god</li>
	<li>king</li>
	<li>king god</li>
	<li>...</li>
</ul>

<p>각 차례마다 위와 같은 순서대로 말해야한다.</p>

<p>디디는 문득 게임내에서 임의의 단어 k가 외쳐진 횟수가 X번째가 될 때, 그 차례가 몇번 째 인지 궁금해지기 시작했다.&nbsp;그런 디디의 궁금증을 해결해 줄 프로그램을 작성하라.</p>

### 입력

<p>첫째 줄에 n(1 &le; n &le; 2 &times; 10<sup>5</sup>)과 b(n &le; b &le;&nbsp;10<sup>12</sup>)가 주어진다.</p>

<p>둘째 줄에는 임의의 단어 k와 X(1 &le; X &le; 10<sup>12</sup>)가 주어진다.</p>

<p>셋째 줄에는 게임에 쓰일 단어 n개가 공백으로 구분되어 주어진다. 모든 단어는 알파벳 소문자로 구성되어 있으며, 각 단어의 길이는 10을 넘지 않는다.</p>

### 출력

<p>문제의 정답을 출력하라. 정답이 항상 존재하는 경우만 입력으로 주어지는 것이 보장된다.</p>