# [Gold III] Two Charts Become One - 27619

[문제 링크](https://www.acmicpc.net/problem/27619)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 20, 맞힌 사람: 19, 정답 비율: 38.000%

### 분류

파싱, 문자열, 트리

### 문제 설명

<p>When businesses feel that they are a little bloated and in need of restructuring, they call in the well-known reorganization consultant Don Sizing.  One of the first things Don asks for is a chart showing the hierarchy of departments in the business, i.e., which departments are in charge of other departments.  Often there will be some confusion about this hierarchy and Don will end up with two or more different charts displaying the same set of departments.  In situations like this Don must determine if the charts are similar, i.e., if they show the exact set of hierarchies while not necessarily being drawn the same way. For example, consider the two charts shown on the left in Figure K.1.  While they do not look the same, they do represent the same hierarchies -- department $11$ is in charge of departments $10$ and $12$ and department $12$ is in charge of departments $13$, $17$ and $28$.  The three charts on the right in Figure K.1 are all truly different, each representing  different hierarchies.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/27619.%E2%80%85Two%E2%80%85Charts%E2%80%85Become%E2%80%85One/9b71a22b.png" data-original-src="https://upload.acmicpc.net/e2462d8b-7efd-4970-9101-65b01c1e7182/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 94px;" /></p>

<p style="text-align: center;">Figure K.1: Two sets of hierarchical charts.</p>

<p>For companies with small numbers of departments, determining whether two charts are the same is relatively simple, but for larger companies it can be rather difficult.  Don has sized up this problem and decided he needs some software to solve this problem for him. </p>

### 입력

<p>Input consists of two lines, each representing one hierarchical chart.  The syntax for a hierarchical chart is the following:</p>

<ol>
	<li>a department number <code>d</code> by itself is a hierarchical chart</li>
	<li>the string \verb+d (c1) (c2) ... (cn)+ is a hierarchical chart, where <code>d</code> is a department number and <code>c1, c2, ..., cn</code> are hierarchical charts.</li>
</ol>

<p>Case 2 represents the case where department <code>d</code> is in charge of the departments at the top of the hierarchies <code>c1, c2, ..., cn</code>.  Each input line will contain at most $100\,000$ departments and no department will be in charge of more than $100$ other departments.  All department numbers are integers between $1$ and $1\,000\,000$.  We say that a hierarchical chart described by case 1 has leadership depth $1$, and a hierarchical chart described by case 2 has leadership depth equal to one plus the maximum leadership depth of the hierarchical charts <code>c1</code>, <code>c2</code>, \dots, <code>cn</code>.  The input will have a leadership depth at most $1\,000$.  There may be any number of spaces on either side of an opening or closing parenthesis.</p>

### 출력

<p>Output <code>Yes</code> if the two hierachical charts are similar and <code>No</code> otherwise.</p>