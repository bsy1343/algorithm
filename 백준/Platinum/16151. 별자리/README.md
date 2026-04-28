# [Platinum II] 별자리 - 16151

[문제 링크](https://www.acmicpc.net/problem/16151)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 238, 정답: 49, 맞힌 사람: 42, 정답 비율: 23.596%

### 분류

값 / 좌표 압축, 자료 구조, 다이나믹 프로그래밍, 세그먼트 트리, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p dir="ltr" style="margin-top:0pt; margin-bottom:0pt">별의 신 디디는 자신이 만들었던 별자리를 사람들이 알아보지 못해 속상했다. 그래서 이번에는 좌표평면 상에 존재하는 별들로&nbsp;알아보기 쉬운&nbsp;별자리를 하나&nbsp;만들려고 한다. 별자리에 속한 별들의 집합을 <em>S</em>라고 하자. 디디는 집합 <em>S</em>에 속해 있는&nbsp;임의의&nbsp;별을&nbsp;원점으로 생각했을 때,&nbsp;그 별을 제외한&nbsp;<em>S</em>의 모든 별들이&nbsp;1사분면 혹은 3사분면에 있다면, 그&nbsp;별자리를 알아보기 쉽다고 생각한다. 사분면의 정의는 다음 링크를 따른다. (<strong><a href="https://ko.wikipedia.org/wiki/%EC%82%AC%EB%B6%84%EB%A9%B4">링크</a>.</strong>&nbsp;단, 좌표축은 사분면에 포함되지 않는다.)</p>

<p dir="ltr" style="margin-top:0pt; margin-bottom:0pt">&nbsp;</p>

<p dir="ltr" style="text-align: center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16151.%E2%80%85%EB%B3%84%EC%9E%90%EB%A6%AC/f4cb5e4c.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16151.%E2%80%85%EB%B3%84%EC%9E%90%EB%A6%AC/f4cb5e4c.png" data-original-src="https://upload.acmicpc.net/87dec6e9-cda9-46df-a5d9-d988e592bfdd/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 150px; height: 150px;" /></p>

<p dir="ltr" style="text-align: center">올바른 예시</p>

<p dir="ltr" style="margin-top: 0pt; margin-bottom: 0pt; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16151.%E2%80%85%EB%B3%84%EC%9E%90%EB%A6%AC/ef882598.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16151.%E2%80%85%EB%B3%84%EC%9E%90%EB%A6%AC/ef882598.png" data-original-src="https://upload.acmicpc.net/e36b590f-3705-4b98-bab3-ab7e072c15b9/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 150px; height: 150px;" />&nbsp;&nbsp;&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16151.%E2%80%85%EB%B3%84%EC%9E%90%EB%A6%AC/7355831b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16151.%E2%80%85%EB%B3%84%EC%9E%90%EB%A6%AC/7355831b.png" data-original-src="https://upload.acmicpc.net/766ae188-5a76-4071-b3c5-b0ae7699092b/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 150px; height: 150px;" /></p>

<p dir="ltr" style="margin-top: 0pt; margin-bottom: 0pt; text-align: center;">올바르지 않은 예시</p>

<p dir="ltr" style="margin-top: 0pt; margin-bottom: 0pt; text-align: center;">&nbsp;</p>

<p dir="ltr" style="margin-top: 0pt; margin-bottom: 0pt;">또한, 알아보기 쉬운 별자리는 집합&nbsp;<em>S</em>에 속해 있는&nbsp;임의의&nbsp;별을&nbsp;원점으로 생각했을 때, 어떤 사분면에 <em>S</em>의 별이 존재하는 경우, 그러한 각각의&nbsp;사분면에서 |<em>X</em><sub><em>i</em>&nbsp;</sub>- <em>X<sub>j</sub></em>| +&nbsp;|<em>Y<sub>i</sub></em><sub> </sub>- <em>Y<sub>j</sub></em>|가&nbsp;가장 작은&nbsp;별들과 아래 조건을 만족해야 한다.</p>

<p dir="ltr" style="margin-top: 0pt; margin-bottom: 0pt; text-align: center;">|<em>X</em><sub><em>i</em>&nbsp;</sub>- <em>X<sub>j</sub></em>| &le;&nbsp;<em>L </em><code>그리고</code>&nbsp;|<em>Y<sub>i</sub></em><sub> </sub>- <em>Y<sub>j</sub></em>| &le;&nbsp;<em>L</em></p>

<p dir="ltr" style="margin-top: 0pt; margin-bottom: 0pt; text-align: center;">(단, <em>i</em>는 원점으로 생각한 별, <em>j</em>는 그 사분면에서 |<em>X</em><sub><em>i</em>&nbsp;</sub>- <em>X<sub>j</sub></em>| +&nbsp;|<em>Y<sub>i</sub></em><sub> </sub>- <em>Y<sub>j</sub></em>|가&nbsp;가장 작은&nbsp;별을 의미한다.)</p>

<p dir="ltr" style="margin-top: 0pt; margin-bottom: 0pt; text-align: center;">&nbsp;</p>

<p dir="ltr" style="margin-top: 0pt; margin-bottom: 0pt;">디디는 알아보기 쉬운&nbsp;별자리 중 구성하는 별들의 밝기의 합이 가장 큰 별자리를 만들려고 한다. 디디를 도와 밝기의 합의 최댓값을&nbsp;구하는 프로그램을 작성하라.</p>

### 입력

<p>첫째 줄에 좌표평면 상에 존재하는 별의 개수 <em>N&nbsp;</em>(1 &le;&nbsp;<em>N</em>&nbsp;&le; 2&nbsp;x 10<sup>5</sup>), 문제에서 주어진 정수&nbsp;<em>L&nbsp;</em>(1 &le;&nbsp;<em>L</em>&nbsp;&le;&nbsp;10<sup>9</sup>)이 공백으로 구분되어 주어진다.</p>

<p>둘째 줄부터 <em>N</em>개의 줄에는 각각 별의 위치 <em>X<sub>i</sub></em><sub>,</sub> <em>Y<sub>i&nbsp;</sub></em>(1 &le;&nbsp;<em>X<sub>i</sub></em>, <em>Y<sub>i&nbsp;</sub></em>&le;&nbsp;10<sup>9</sup>) 별의 밝기 <em>B<sub>i </sub></em>(1 &le;&nbsp;<em>B<sub>i</sub></em>&nbsp;&le; 10<sup>4</sup>)가 공백으로 구분되어 주어진다. 주어지는 입력은 모두 정수이며, 같은 위치를 가지는 별들도 입력으로 주어질 수 있음에 유의하라.</p>

### 출력

<p>구성하는 별들의 밝기의 합이 가장 큰 알아보기 쉬운&nbsp;별자리의 밝기의 합을 출력하라.</p>