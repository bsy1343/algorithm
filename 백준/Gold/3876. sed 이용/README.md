# [Gold IV] sed 이용 - 3876

[문제 링크](https://www.acmicpc.net/problem/3876)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 153, 정답: 68, 맞힌 사람: 60, 정답 비율: 55.046%

### 분류

구현, 자료 구조, 그래프 이론, 문자열, 그래프 탐색, 집합과 맵, 너비 우선 탐색, 해시를 사용한 집합과 맵

### 문제 설명

<p>sed는 입력으로 주어지는 문자열에 등장하는 문자열 &alpha;를 다른 문자열 &beta;로 바꾸는데 사용되는 리눅스 유틸이다. 여기서 입력으로 주어지는 문자열은 파일의 각 한 줄이다. sed는 다음과 같은 2가지 과정을 거친다.</p>

<ol>
	<li>입력 문자열에서 겹치지 않는 &alpha;를 표시한다. 이때, &alpha;가 서로 겹칠 수는 있다. 만약, 겹치지 않게 선택하는 경우가 여러 가지 있을 때는 가장 왼쪽 것을 선택한다.</li>
	<li>위에서 표시한 모둔 문자열 &alpha;를 문자열 &beta;로 바꾼다. 나머지 문자는 바꾸지 않고 그대로 놔둔다.</li>
</ol>

<p>예를 들어, &alpha;가 &quot;aa&quot;이고, &beta;가 &quot;bca&quot;, 입력 문자열이 &quot;aaxaaa&quot;라면 sed를 실행한 결과는 &quot;bcaxbcaa&quot;가 된다. (&quot;aaxbcaa&quot;, &quot;bcaxabca&quot;는 될 수 없다) 이 결과 &quot;bcaxbcaa&quot;를 가지고 다시 sed를 실행하면 결과는 &quot;bcaxbcbca&quot;가 된다.</p>

<p>문자열을 바꾸는 규칙의 쌍 (&alpha;<sub>i</sub>, &beta;<sub>i</sub>) (i = 1,2,...,n), 초기 문자열 &gamma;, 최종 문자열 &delta;가 주어진다. 이때, sed를 이용해서 &gamma;를 &delta;로 바꿀 때, 문자열 바꾸는 회수의 최솟값을 구하려고 한다.</p>

<p>하나의 규칙(&alpha;<sub>i</sub>, &beta;<sub>i</sub>)은 위에서 설명한 것 같이, 입력 문자열에서 겹치지 않는 모든 부분 문자열 &alpha;<sub>i</sub>를 &beta;<sub>i</sub>로 동시에 바꾸는 것을 의미한다.</p>

<p>한 규칙(&alpha;<sub>i</sub>, &beta;<sub>i</sub>)을 여러 번 사용해도 되고, 사용하지 않아도 된다.</p>

### 입력

<p>입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 다음과 같은 형식이다.</p>

<pre>
n
&alpha;<sub>1</sub> &beta;<sub>1</sub>
&alpha;<sub>2</sub> &beta;<sub>2</sub>
...
&alpha;<sub>n</sub> &beta;<sub>n</sub>
&gamma;
&delta;</pre>

<p>n은 문자열을 바꾸는 규칙의 쌍의 개수이다. &alpha;<sub>i</sub>와 &beta;<sub>i</sub>는 공백으로 구분되어 있으며, 1 &le; |&alpha;<sub>i</sub>| &lt; |&beta;<sub>i</sub>| &le; 10을 만족한다. (|s|는 문자열 s의 길이) 모든 i&ne;j에 대해서 &alpha;<sub>i</sub>&ne;&alpha;<sub>j</sub>이며, n &le; 10, 1 &le; |&gamma;| &lt; |&delta;| &le; 10 이다. 모든 문자열을 알파벳 소문자로만 이루어져 있고, 입력의 마지막 줄에는 0이 하나 주어진다.</p>

### 출력

<p>각 테스트 케이스에 대해서, &gamma;를 &delta;로 바꿀 때 필요한 문자열 바꾸는 회수의 최솟값을 출력한다. 만약 &gamma;를 &delta;로 바꿀 수 없다면, -1을 출력한다.</p>