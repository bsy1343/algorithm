# [Gold V] Substring Expression - 22643

[문제 링크](https://www.acmicpc.net/problem/22643)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 22, 맞힌 사람: 22, 정답 비율: 88.000%

### 분류

수학, 문자열, 애드 혹, 조합론

### 문제 설명

<p>Trees are sometimes represented in the form of strings. Here is one of the most popular ways to represent unlabeled trees:</p>

<ul>
	<li>Leaves are represented by &quot;()&quot;.</li>
	<li>Other nodes (i.e. internal nodes) are represented by &quot;(&nbsp;<i>S</i><sub>1</sub>&nbsp;<i>S</i><sub>2</sub>&nbsp;...&nbsp;<i>S<sub>n</sub></i>&nbsp;)&quot;, where&nbsp;<i>S<sub>i</sub></i>&nbsp;is the string representing the&nbsp;<i>i</i>-th subnode.</li>
</ul>

<p>For example, the tree depicted in the figure below is represented by a string &quot;((()())())&quot;.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22643.%E2%80%85Substring%E2%80%85Expression/fb3b5141.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22643.%E2%80%85Substring%E2%80%85Expression/fb3b5141.png" data-original-src="https://upload.acmicpc.net/a4456be8-6bdf-418b-9396-e0f3376d6af7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 152px; height: 192px;" /></p>

<p>A strange boy Norward is playing with such strings. He has found that a string sometimes remains valid as the representation of a tree even after one successive portion is removed from it. For example, removing the underlined portion from the string &quot;((()())())&quot; results in &quot;((()))&quot;, which represents the tree depicted below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22643.%E2%80%85Substring%E2%80%85Expression/084c579f.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22643.%E2%80%85Substring%E2%80%85Expression/084c579f.png" data-original-src="https://upload.acmicpc.net/ca95a8fa-42ef-4524-a49a-de6898c78a67/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 45px; height: 192px;" /></p>

<p>However, he has no way to know how many ways of such removal there are. Your task is to write a program for it, so that his curiosity is fulfilled.</p>

### 입력

<p>The input contains a string that represents some unlabeled tree. The string consists of up to 100,000 characters.</p>

### 출력

<p>Print the number of portions of the given string such that removing them results in strings that represent other valid trees.</p>