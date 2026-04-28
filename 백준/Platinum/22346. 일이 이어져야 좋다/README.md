# [Platinum I] 일이 이어져야 좋다 - 22346

[문제 링크](https://www.acmicpc.net/problem/22346)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 674, 정답: 117, 맞힌 사람: 72, 정답 비율: 19.835%

### 분류

분할 정복

### 문제 설명

<p>양의 정수 N으로 만들어지는 문자열 S<sub>N</sub>은 다음과 같이 정의된다. 아래에서 &lfloor;N/2&rfloor;은 N을 2로 나눈 몫이다.</p>

<ol>
	<li>N = 1인 경우: S<sub>N</sub> = 1 (즉, 1 한 글자로 이루어진 문자열)</li>
	<li>N &ge; 2이고 N이 짝수인 경우: S<sub>N</sub> = S<sub>&lfloor;N/2&rfloor;</sub> 0 S<sub>&lfloor;N/2&rfloor;</sub> (즉, 0 한 글자 좌우에 S<sub>&lfloor;N/2&rfloor;</sub>가 이어진 문자열)</li>
	<li>N &ge; 2이고 N이 홀수인 경우: S<sub>N</sub> = S<sub>&lfloor;N/2&rfloor;</sub> 1 S<sub>&lfloor;N/2&rfloor;</sub> (즉, 1 한 글자 좌우에 S<sub>&lfloor;N/2&rfloor;</sub>가 이어진 문자열)</li>
</ol>

<p>위의 약속에 따라 S<sub>13</sub>을 구해보면 다음과 같다.</p>

<ul>
	<li>위의 약속에서 적용이 가능한 것은 3번이므로 S<sub>13</sub> = S<sub>6</sub> 1 S<sub>6</sub>임을 알수 있다.</li>
	<li>S<sub>6</sub>은 위의 약속의 2번에 의해 S<sub>3</sub> 0 S<sub>3</sub>이 되므로 S<sub>13</sub> = S<sub>6</sub> 1 S<sub>6</sub> = S<sub>3</sub> 0 S<sub>3</sub> 1 S<sub>3</sub> 0 S<sub>3</sub>이다.</li>
	<li>S<sub>3</sub>은 위의 약속의 3번과 1번을 순서대로 적용하면 111이 된다.</li>
	<li>따라서 S<sub>13</sub> = 111011111110111이다.</li>
</ul>

<p>양의 정수 N이 주어질 때, 아래와 같은 형태의 질의 Q개를 해결하는 프로그램을 작성하라.</p>

<p>q (1 &le; q &le; Q)번째 질의는 세 개의 정수 (i<sub>q</sub>, j<sub>q</sub>, k<sub>q</sub>)가 주어질 때 다음과 같다: S<sub>N</sub>[i<sub>q</sub>..j<sub>q</sub>]에서 0을 최대 k<sub>q</sub>개까지 포함하는 가장 긴 부분문자열의 길이는?</p>

<p>위의 예에서 질의가 (1, 15, 0)이라면 가장 긴 부분문자열은 1로만 이루어져야 한다. 또, 질의가 S<sub>13</sub> 전체에서 찾기를 요구하고 있으므로 해당 문자열의 길이는 7이다.</p>

<p>만약, (2, 14, 2)이라면 질의는 S<sub>13</sub>의 두번째부터 14번째 문자까지에서 0이 최대 2개인 가장 긴 부분문자열을 찾으라고 요구한다. 그런데 S<sub>13</sub>[2..14] = 1101111111011에는 0이 2개 뿐이므로 그 전체가 답이 되고, 그 길이는 13이다.</p>

### 입력

<p>첫 번째 줄에 N과 질의의 개수 Q가 정수로 주어진다.</p>

<p>다음 Q개의 줄에 질의들이 한 줄에 하나씩 주어진다. 이 중 q (1 &le; q &le; Q)번째 줄에는 세 개의 정수 i<sub>q</sub>, j<sub>q</sub>, k<sub>q</sub>가 공백 하나씩을 사이로 두고 주어진다.</p>

### 출력

<p>각 질의에 대한 답을 질의가 주어진 순서대로 각각 한줄에 하나씩 출력한다.</p>

### 제한

<ul>
	<li>1 &le; N &le; 10<sup>18</sup></li>
	<li>1 &le; Q &le; 10 000</li>
	<li>&sum;k<sub>q</sub> &le; 10 000 (1 &le; q &le; Q). 즉, 모든 질의에서 주어지는 k의 값을 더하면 최대 10 000이다.</li>
	<li>모든 1 &le; q &le; Q에 대해, 1 &le; i<sub>q</sub> &le; j<sub>q</sub> &le; (S<sub>N</sub>의 길이)</li>
</ul>

### 힌트

<p>부분문자열의 정의 길이가 l인 문자열 s와 1 &le; i &le; j &le; l인 두 정수 i와 j에 대해, s[i..j]는 s의 i번째 문자에서부터 j번째 문자까지를 모두 순서대로 포함하는 문자열이며, 이러한 문자열들을 문자열 s의 <strong>부분문자열</strong>이라고 한다.</p>

<p>예를 들어 s가 <code>0100101</code>이라면, s[3..5]는 <code>001</code>이고, s[4..7]은 <code>0101</code>이다. 따라서 <code>001</code>과 <code>0101</code>은 문자열 <code>0100101</code>의 부분문자열이다. 하지만 <code>1010</code>은 문자열 <code>0100101</code>의 부분문자열이 아니다.</p>