# [Bronze II] 1번부터 문제의 상태가…? - 23027

[문제 링크](https://www.acmicpc.net/problem/23027)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 1493, 정답: 1026, 맞힌 사람: 910, 정답 비율: 70.488%

### 분류

구현, 문자열

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/23027.%E2%80%851%EB%B2%88%EB%B6%80%ED%84%B0%E2%80%85%EB%AC%B8%EC%A0%9C%EC%9D%98%E2%80%85%EC%83%81%ED%83%9C%EA%B0%80%E2%80%A6%3F/74ac7b3b.png" data-original-src="https://upload.acmicpc.net/4873cb09-8c7c-4425-9736-39fd62ba48ed/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 417px; width: 500px;" /></p>

<p>큰일이다. 시험 문제를 본 쿠기는 1번부터 풀 수가 없다. 시험 시간 동안 할 일이 없었던 쿠기는 교수님께 편지를 쓰려고 한다. 작년 시험에서 교수님께 그동안 감사했다는 편지를 전하고 <strong>D+</strong>을 받았던 기억이 있다.&nbsp;그때 성적이 문제였는지, 편지가 문제였는지 궁금하여 이번에도 1번 문제의 답안 칸에 편지를 작성하려고 한다. 혹시나 하는 마음에 쿠기는&nbsp;<strong>D+</strong>만은&nbsp;피하고자&nbsp;편지를 수정하려고 한다.</p>

<ol>
	<li>편지의 내용 <em>S</em>에 &#39;<code>A</code>&#39;가 있다면 <em>S</em>에 있는 &#39;<code>B</code>&#39;, &#39;<code>C</code>&#39;, &#39;<code>D</code>&#39;, &#39;<code>F</code>&#39;를&nbsp;모두 &#39;<code>A</code>&#39;로 변경한다.</li>
	<li>&#39;<code>A</code>&#39;가 없고 &#39;<code>B</code>&#39;가 있다면 <em>S</em>에 있는 &#39;<code>C</code>&#39;, &#39;<code>D</code>&#39;, &#39;<code>F</code>&#39;를 모두 &#39;<code>B</code>&#39;로 변경한다.</li>
	<li>&#39;<code>A</code>&#39;와 &#39;<code>B</code>&#39;가 없고 &#39;<code>C</code>&#39;가 있다면 <em>S</em>에 있는 &#39;<code>D</code>&#39;, &#39;<code>F</code>&#39;를 모두 &#39;<code>C</code>&#39;로 변경한다.</li>
	<li>&#39;<code>A</code>&#39;,&nbsp;&#39;<code>B</code>&#39;와&nbsp;&#39;<code>C</code>&#39;가 모두 없다면 <em>S</em>에 있는 모든 문자를 &#39;<code>A</code>&#39;로 변경한다.</li>
</ol>

<p>쿠기를 도와 편지를 수정하는 것을 도와주자.</p>

### 입력

<p>편지의 내용&nbsp;<em>S</em>(1 &le; <em>S </em>의 길이 &le; 1,000)가 주어진다. 문자열 <em>S</em>는 알파벳 대문자로 이루어져 있다.</p>

### 출력

<p>수정된 편지의 내용을 출력한다.</p>