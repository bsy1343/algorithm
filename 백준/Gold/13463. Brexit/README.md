# [Gold V] Brexit - 13463

[문제 링크](https://www.acmicpc.net/problem/13463)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 294, 정답: 177, 맞힌 사람: 143, 정답 비율: 60.851%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>A long time ago in a galaxy far, far away, there was a large interstellar trading union, consisting&nbsp;of many countries from all across the galaxy. Recently, one of the countries decided to leave&nbsp;the union. As a result, other countries are thinking about leaving too, as their participation&nbsp;in the union is no longer beneficial when their main trading partners are gone.</p>

<p>You are a concerned citizen of country X, and you want to find out whether your country will&nbsp;remain in the union or not. You have crafted a list of all pairs of countries that are trading&nbsp;partners of one another. If at least half of the trading partners of any given country Y leave&nbsp;the union, country Y will soon follow. Given this information, you now intend to determine&nbsp;whether your home country will leave the union.</p>

### 입력

<p>The input starts with one line containing four space separated integers C, P, X, and L. These&nbsp;denote the total number of countries (2 &le; C &le; 200 000), the number of trading partnerships&nbsp;(1 &le; P &le; 300 000), the number of your home country (1 &le; X &le; C) and finally the number&nbsp;of the first country to leave, setting in motion a chain reaction with potentially disastrous&nbsp;consequences (1 &le; L &le; C).</p>

<p>This is followed by P lines, each containing two space separated integers A<sub>i</sub> and B<sub>i </sub>satisfying&nbsp;1 &le; A<sub>i</sub> &lt; B<sub>i</sub> &le; C. Such a line denotes a trade partnership between countries A<sub>i</sub> and B<sub>i</sub>&nbsp;. No&nbsp;pair of countries is listed more than once.</p>

<p>Initially, every country has at least one trading partner in the union.</p>

### 출력

<p>For each test case, output one line containing either &ldquo;leave&rdquo; or &ldquo;stay&rdquo;, denoting whether&nbsp;you home country leaves or stays in the union.</p>