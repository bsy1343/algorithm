# [Gold III] 세 친구 - 10096

[문제 링크](https://www.acmicpc.net/problem/10096)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 1346, 정답: 341, 맞힌 사람: 279, 정답 비율: 26.496%

### 분류

문자열, 애드 혹

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10096.%E2%80%85%EC%84%B8%E2%80%85%EC%B9%9C%EA%B5%AC/14e2d812.png" data-original-src="https://upload.acmicpc.net/7c16b9a4-a064-4998-b77f-b08892963bdf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 162px; height: 100px; float: right;" />준규, 해빈, 진욱이는 다음과 같은 게임을 한다.</p>

<p>먼저, 준규가 문자열 S를 고른다. 그 다음, 해빈이는 S의 뒤에 S를 붙인 새로운 문자열 T를 만든다. 마지막으로 진욱이는 문자열 T의 어딘가(시작이나 끝도 가능)에 문자 하나를 삽입해 문자열 U를 만든다.</p>

<p>U가 주어졌을 때, S를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 U의 길이 N이 주어지고, 둘째 줄에 U가 주어진다. U는 알파벳 대문자로만 이루어져 있다.</p>

### 출력

<ol>
	<li>U를 만들 수 없는 경우에는 &quot;<code>NOT POSSIBLE</code>&quot;을 출력한다.</li>
	<li>U를 만들 수 있는 문자열 S가 유일하지 않다면, &quot;<code>NOT UNIQUE</code>&quot;를 출력한다.</li>
	<li>나머지 경우에는 S를 출력한다.</li>
</ol>