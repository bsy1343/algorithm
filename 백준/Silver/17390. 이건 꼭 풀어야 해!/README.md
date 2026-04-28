# [Silver III] 이건 꼭 풀어야 해! - 17390

[문제 링크](https://www.acmicpc.net/problem/17390)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 5308, 정답: 2634, 맞힌 사람: 2240, 정답 비율: 51.048%

### 분류

정렬, 누적 합

### 문제 설명

<p>숭실골 높은 언덕 깊은 골짜기에&nbsp;출제로 고통 받는 욱제가 살고 있다!</p>

<p>욱제는 또 출제를 해야 해서 단단히 화가 났다. 그래서 욱제는 길이 <em>N</em>짜리 수열 <em>A</em>를 만들고,&nbsp;<em>A</em>를 비내림차순으로 정렬해서 수열&nbsp;<em>B</em>를 만들어 버렸다!! 여기서 <em>B</em>를 출력하기만 하면 문제가 너무 쉬우니까 하나만 더 하자. 아래와 같은 질문이 무려 <em>Q</em>개나 주어진다!! (ㅎㅎ;; ㅈㅅ.. ㅋㅋ!!)</p>

<ul>
	<li><strong>L&nbsp;R:</strong>&nbsp;<em>B<sub>L</sub> + B<sub>L+1</sub> + ... + B<sub>R-1</sub> + B<sub>R</sub></em> 을 출력한다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/17390.%E2%80%85%EC%9D%B4%EA%B1%B4%E2%80%85%EA%BC%AD%E2%80%85%ED%92%80%EC%96%B4%EC%95%BC%E2%80%85%ED%95%B4!/71da4876.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/17390.%E2%80%85%EC%9D%B4%EA%B1%B4%E2%80%85%EA%BC%AD%E2%80%85%ED%92%80%EC%96%B4%EC%95%BC%E2%80%85%ED%95%B4!/71da4876.png" data-original-src="https://upload.acmicpc.net/c849170d-749c-4743-9829-2136c89e2212/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><strong>Figure 1.</strong>&nbsp;모든 참가자가&nbsp;문제를 풀 수 있을 것이라고&nbsp;기대하는 욱제의 표정</p>

<p>욱제의 질문에 답하고 함께 엠티를 떠나자!!</p>

### 입력

<p>첫 번째 줄에 수열 <em>A</em>의 길이<em> N</em>과 질문의 개수<em> Q</em>가 공백으로 구분되어 주어진다. (1 &le; <em>N</em>, <em>Q</em>&nbsp;&le; 300,000)</p>

<p>두 번째 줄에 <em>N</em>개의 정수 <em>A<sub>1</sub></em>, <em>A<sub>2</sub></em>, ..., <em>A<sub>N</sub></em> 이 공백으로 구분되어 주어진다. <em>A<sub>i</sub></em> 는 수열 <em>A</em>의 <em>i</em> 번째 수이다. (1&nbsp;&le; <em>A<sub>i</sub></em>&nbsp;&le; 1,000)</p>

<p>세 번째 줄부터 <em>Q</em>개의 줄에 걸쳐 욱제의 질문을 의미하는 두 수 <em>L</em>, <em>R</em>이 공백으로 구분되어 주어진다. (1&nbsp;&le; <em>L</em>&nbsp;&le; <em>R</em>&nbsp;&le; <em>N</em>)</p>

<p>주어지는 모든 입력은 자연수이다.</p>

### 출력

<p><em>Q</em>개의 줄에 걸쳐, 질문의 답을 순서대로 각각 출력한다.</p>

### 힌트

<p>비내림차순은 원소가 감소하지 않는 (같거나 증가하는) 순서를 말한다.</p>

<div style="background:#eeeeee;border:1px solid #cccccc;padding:5px 10px;"><code>while (Q--) {<br />
&nbsp; &nbsp; int sum = 0, L, R;<br />
&nbsp; &nbsp; scanf(&ldquo;%d %d&rdquo;, &amp;L, &amp;R);<br />
&nbsp; &nbsp; for (int i = L; i &lt;= R; i++) {<br />
&nbsp; &nbsp; &nbsp; &nbsp; sum += a[i];<br />
&nbsp; &nbsp; }<br />
&nbsp; &nbsp; printf(&ldquo;%d\n&rdquo;, sum);<br />
}</code></div>

<p>위와 같이 각 질문마다 반복문을 매번 돌려서 답을 계산하면, 시간복잡도가 <em>O(QN)</em>이 되므로 시간 초과를 받게 된다. 다른 방법을 이용해 문제를 해결해야 한다.</p>