# [Platinum I] Chemical table - 16372

[문제 링크](https://www.acmicpc.net/problem/16372)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 132, 정답: 55, 맞힌 사람: 48, 정답 비율: 47.525%

### 분류

자료 구조, 분리 집합

### 문제 설명

<p>Innopolis University scientists continue to investigate the periodic table. There are n &middot; m known elements and they form a periodic table, a rectangle with n rows and m columns. Each element can be described by its coordinates (r, c) (1 &le; r &le; n, 1 &le; c &le; m) in the table. Recently scientists discovered that for every four different elements in this table that form a rectangle with sides parallel to sides of the table, if they have samples of three of four elements, they can produce a sample of the fourth element using nuclear fusion. So if we have elements in positions (r<sub>1</sub>, c<sub>1</sub>), (r<sub>1</sub>, c<sub>2</sub>), (r<sub>2</sub>, c<sub>1</sub>), where r<sub>1</sub> &ne; r<sub>2</sub> and c<sub>1</sub> &ne;&nbsp;c<sub>2</sub>, then we can produce element (r<sub>2</sub>, c<sub>2</sub>).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16372.%E2%80%85Chemical%E2%80%85table/3384aca2.png" data-original-src="https://upload.acmicpc.net/d619a22a-dd64-4073-9072-da383feec811/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 416px; height: 142px;" /></p>

<p>Original samples of elements as well as newly crafted elements can be used again in future fusions.</p>

<p>Innopolis University scientists already have samples of q elements. They want to obtain samples of all n&middot;m elements. To achieve that, they will purchase some samples from other laboratories and then produce all remaining elements using arbitrary number of nuclear fusions in some order. Help them find the minimal number of elements they need to purchase.</p>

### 입력

<p>First line contains three integers n, m, q (1 &le; n, m &le; 200 000; 0 &le; q &le; min(n&middot;m, 200 000))&mdash;chemical table dimensions and the number of elements scientists already have. Following q lines contain two integers r<sub>i</sub>, c<sub>i</sub> (1 &le; r<sub>i</sub> &le; n, 1 &le; c<sub>i</sub> &le; m) each&mdash;descriptions of the elements that scientists already have. All elements in the input are different.</p>

### 출력

<p>In the only line print k&mdash;the minimal number of elements to be purchased.</p>

### 힌트

<p>Pictures below explain examples.</p>

<p>The first picture for each example describes the initial set of element samples available. Black crosses represent elements available in the lab initially.</p>

<p>The second picture describes how remaining samples can be obtained. Red dashed circles denote elements that should be purchased from another labs (optimal solution should minimize number of red circles). Blue dashed circles are elements which can be produced with nuclear fusion. They are numbered starting in order in which they can be produced.</p>

<p><strong>Test 1</strong></p>

<p>We can use nuclear fusion and get the element from other three samples, so we don&rsquo;t need to purchase anything.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16372.%E2%80%85Chemical%E2%80%85table/e7019b23.png" data-original-src="https://upload.acmicpc.net/b8527587-b6ea-4c4a-8acc-aff4fd5cf2e2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 373px; height: 117px;" /></p>

<p><strong>Test 2</strong></p>

<p>We cannot use any nuclear fusion at all as there is only one row, so we have to purchase all missing elements.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16372.%E2%80%85Chemical%E2%80%85table/b62c3e96.png" data-original-src="https://upload.acmicpc.net/3e576281-9274-4c02-b8d1-0bc60398b76a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 596px; height: 78px;" /></p>

<p><strong>Test 3</strong></p>

<p>Note that after purchasing one element it&rsquo;s still not possible to produce the middle element in the top row (marked as 4). So we produce the element in the left-bottom corner first (marked as 1), and then use it in future fusions.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16372.%E2%80%85Chemical%E2%80%85table/b4c9ee43.png" data-original-src="https://upload.acmicpc.net/a3de3236-dcb7-4fd9-99f8-82f07c2d955f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 451px; height: 194px;" /></p>