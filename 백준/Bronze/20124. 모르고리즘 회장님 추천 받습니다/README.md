# [Bronze II] 모르고리즘 회장님 추천 받습니다 - 20124

[문제 링크](https://www.acmicpc.net/problem/20124)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 2126, 정답: 1338, 맞힌 사람: 1148, 정답 비율: 65.826%

### 분류

구현, 문자열, 정렬

### 문제 설명

<p>국렬이는 모르고리즘 차기 회장을 빠르게 구해야 한다. 안 그러면 대학원 가서도 회장을 해야 하기 때문이다.</p>

<p>그래서 국렬이는 어떻게든 2020년 연세대학교 프로그래밍 경진대회를 열어서 차기 회장을 선택하려고 했으나, 코로나19 때문에 미루고 결국 11월에 개최하게 되었다.</p>

<p>국렬이는 대회를 치른 사람&nbsp;중에서 점수가 가장 높은 사람을 억지로 차기 회장으로 지목하려고 한다. 만약에 가장 높은 사람이 2명 이상 있는 경우, 이름이 사전 순으로 가장 앞선 사람을 차기 회장으로 뽑을 것이다.</p>

<p>차기 회장으로 누가 지목될지 알아내라.</p>

### 입력

<p>다음과 같이 입력이 주어진다.</p>

<div style="background:#eeeeee;border:1px solid #cccccc;padding:5px 10px;"><em>N</em><br />
<em>A<sub>1</sub></em>&nbsp;<em>B<sub>1</sub></em><br />
. . . . . .<br />
<em>A<sub>N</sub></em>&nbsp;<em>B<sub>N</sub></em></div>

### 출력

<p>첫째 줄에 차기 회장으로 뽑힐 사람의 이름을 출력하여라.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<em>N</em> &le; 100,000.&nbsp;<em>N</em>은 사람의 수를 나타내는 양의 정수다.</li>
	<li><em>A<sub>i</sub></em>는 길이가 1 이상 10 이하의 알파벳 소문자로 구성된 문자열로 참여자의 이름이다. (1 &le;&nbsp;<em>i</em> &le; <em>N</em>)</li>
	<li><em>A<sub>i</sub></em> &ne; <em>A<sub>j</sub></em>&nbsp;(1 &le; <em>i &lt;</em>&nbsp;<em>j</em> &le; <em>N</em>)</li>
	<li>1 &le;&nbsp;<em>B<sub>i</sub></em>&nbsp;&le; 1,000,000,000&nbsp;(1 &le; <em>i</em> &le; <em>N</em>).&nbsp;<em>B<sub>i</sub></em>는 점수를 의미하는 양의 정수다.</li>
</ul>