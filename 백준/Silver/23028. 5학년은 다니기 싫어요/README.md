# [Silver V] 5학년은 다니기 싫어요 - 23028

[문제 링크](https://www.acmicpc.net/problem/23028)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 1322, 정답: 554, 맞힌 사람: 474, 정답 비율: 42.133%

### 분류

구현, 그리디 알고리즘

### 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/5d4e7c30-9dbf-4649-94ea-13ed440ae340/-/preview/" style="height: 417px; width: 500px;" /></p>

<p>5학년은 다니기 싫은 아리는 4학년까지 졸업 학점을 채워 졸업할 수 있는지 궁금해졌다. 아리가 졸업하려면 총 130학점 이상 들어야 하고, 그중 66학점 이상은 전공학점이어야 한다. 아리는 현재 2021년 2학기까지 <em>N</em>학기를 마쳤고, 전공학점 <em>A</em>를&nbsp;포함하여&nbsp;총 <em>B</em>학점을&nbsp;이수하였다. 고민하던 아리는 학교 홈페이지에서 다음과 같은 공지가 올라온 것을 확인했다.</p>

<blockquote>
<p>2022년 1학기부터 2026년 2학기까지 10개의 학기 동안 개설되는 과목의 수를 공지합니다.</p>

<ul>
	<li>2022년 1학기 : 전공과목 <em>X<sub>1</sub></em>개, 비전공 과목 <em>Y<sub>1</sub></em>개</li>
	<li>2022년 2학기 : 전공과목 <em>X<sub>2</sub></em>개, 비전공 과목 <em>Y<sub>2</sub></em>개</li>
	<li>2023년 1학기 : 전공과목 <em>X<sub>3</sub></em>개, 비전공 과목 <em>Y<sub>3</sub></em>개</li>
</ul>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ⋮</p>

<ul>
	<li>2026년 2학기 : 전공과목 <em>X<sub>10</sub></em>개, 비전공 과목 <em>Y<sub>10</sub></em>개</li>
</ul>

<p>2022년 1학기부터는 한 학기에 전공 수업과 비전공 수업을 포함하여 최대&nbsp;6과목을 수강할 수 있습니다.</p>

<p>한 과목을 수강하게 되면 3학점을 얻게 되고, 그러므로 한 학기에 최대&nbsp;18학점을 이수할 수 있습니다. 참고하시기 바랍니다.</p>
</blockquote>

<p>각 수업은 시간표가 서로 겹치지 않아서 아리는 원하는 수업을 모두 수강할 수 있다. 아리는 최대한 빨리 졸업을 하고 싶어서 휴학을 하지 않는다. 아리를 도와 아리가 전에 마쳤던 학기를 포함하여 총 8학기 안에 졸업할 수 있는지 확인하는 프로그램을 작성해보자.</p>

### 입력

<p>세 정수 <em>N</em>(1&nbsp;&le;&nbsp;<em>N</em>&nbsp;&le; 7), <em>A</em>(1 &le;&nbsp;<em>A</em> &le; 150), <em>B</em>(<em>A</em>&nbsp;&le;&nbsp;<em>B</em>&nbsp;&le; 150)이 주어진다.</p>

<p>다음 10개 줄에는 2022년 1학기부터 2026년 2학기까지 차례대로 학기에 개설되는 과목의 수가 주어지고, 한 줄에 한 학기의 전공과목 수 <em>X</em>(1 &le;&nbsp;<em>X</em>&nbsp;&le;&nbsp;6), 비전공 과목 수 <em>Y</em>(1&le;&nbsp;<em>Y</em>&nbsp;&le; 6)이 주어진다.</p>

### 출력

<p>총 8학기 안에 졸업 조건을 맞출 수 있다면 &quot;<code>Nice</code>&quot;를, 불가능하다면 &quot;<code>Nae ga wae</code>&quot;를&nbsp;출력한다.</p>