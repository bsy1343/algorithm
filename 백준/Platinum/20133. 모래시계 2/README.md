# [Platinum I] 모래시계 2 - 20133

[문제 링크](https://www.acmicpc.net/problem/20133)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 1024 MB

### 통계

제출: 242, 정답: 61, 맞힌 사람: 44, 정답 비율: 29.530%

### 분류

수학, 정렬, 기하학, 조합론, 두 포인터

### 문제 설명

<p>모래시계 가공업자 택희의 뒤를 이어서 국렬이가 좌표평면 위에 주어진 점들을 받아서 그 안에서 모래시계를 추출하는 작업을 한다.</p>

<p>모래시계는 아래와 같이 생겼다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20133.%E2%80%85%EB%AA%A8%EB%9E%98%EC%8B%9C%EA%B3%84%E2%80%852/cc4a87b6.png" data-original-src="https://upload.acmicpc.net/98609f29-cedc-4b2a-8804-fd391c4c581a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">[그림] 모래시계</p>

<p>좀 더 정확히 말하면, 다음의 조건을 만족하는 것을 모래시계라고 할 것이다.</p>

<ol>
	<li>삼각형 2개로 두 삼각형이 한 점을 공유한 상태여야 한다.</li>
	<li>삼각형들끼리 서로 겹치면 안 된다.</li>
</ol>

<p>만일 어떤 두 모래시계에 대해, 두 모래시계에 속한 정점과 간선의 합집합이 두 모래시계 중 한쪽과 동일할 때, 이 두 모래시계는 동일한 모래시계라고 한다. 이 조건을 만족하지 않는 모든 두 모래시계는 서로 다른 모래시계이다.</p>

<p>택희처럼 국렬이도 모래시계의 개수를 빠르게 세고 싶다. 국렬이가 택희에게 도전할 수 있게 도와주자.</p>

### 입력

<p>다음과 같이 입력이 주어진다.</p>

<div style="background:#eeeeee;border:1px solid #cccccc;padding:5px 10px;"><em>N</em><br />
<i>x<sub>1</sub></i>&nbsp;<i>y<sub>1</sub></i><br />
. . .<br />
<i>x<sub>N</sub></i>&nbsp;<i>y<sub>N</sub></i></div>

### 출력

<p>만들 수 있는 모래시계의 개수를 출력하여라.</p>

### 제한

<ul>
	<li>1&nbsp;&le;&nbsp;<em>N</em>&nbsp;&le; 1,500. 평면에 있는 점의 개수를 의미한다.</li>
	<li>-10<sup>9</sup>&nbsp;&le; <i>x<sub>i</sub></i>,&nbsp;<em>y<sub>i</sub></em>&nbsp;&le; 10<sup>9</sup>. <em>i</em>&nbsp;번째&nbsp;점들의 좌표를 의미한다. (1&nbsp;&le; <em>i</em>&nbsp;&le; <em>N</em>)</li>
	<li>세 점이 한 직선 위에 있는 경우는 존재하지 않는다.</li>
	<li>입력에 주어진 수들은 전부 정수다.</li>
</ul>