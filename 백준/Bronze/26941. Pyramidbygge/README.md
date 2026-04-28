# [Bronze III] Pyramidbygge - 26941

[문제 링크](https://www.acmicpc.net/problem/26941)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 353, 정답: 261, 맞힌 사람: 223, 정답 비율: 73.355%

### 분류

수학, 구현, 브루트포스 알고리즘, 사칙연산, 시뮬레이션

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/26941.%E2%80%85Pyramidbygge/5a1423d8.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/26941.%E2%80%85Pyramidbygge/5a1423d8.png" data-original-src="https://upload.acmicpc.net/99987025-e52d-4f98-a15f-87a0caa1c4dd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 123px;" /></p>

<p style="text-align: center;">Figure 1: Ett exempel p&aring; en pyramid av h&ouml;jd 3 med 35 block.</p>

<p>N&auml;r man ska inleda ett st&ouml;rre projekt, exempelvis bygga en pyramid, &auml;r det b&auml;st att t&auml;nka efter en g&aring;ng extra. Du ska skriva ett program som ber&auml;knar hur h&ouml;g pyramid man kan bygga om man har tillg&aring;ng till ett visst antal stenblock.</p>

<p>Vi antar att pyramiden &auml;r kompakt, d.v.s. det finns inga h&aring;lrum inuti. Vidare byggs den enligt principen i figure 1. Varje lager &auml;r allts&aring; kvadratiskt med en sidl&auml;ngd som &auml;r tv&aring; block mindre &auml;n det underliggande lagrets. Det &ouml;versta lagret best&aring;r alltid av ett ensamt block.</p>

<p>Det g&ouml;r ingenting om det blir block &ouml;ver, men det f&aring;r inte saknas ett enda block.</p>

### 입력

<p>Indata best&aring;r av ett enda heltal $N$ ($1 \le N \le 100\,000\,000$): antal tillg&auml;ngliga block.</p>

### 출력

<p>Programmet ska skriva ut en rad med ett heltal: h&ouml;jden f&ouml;r den st&ouml;rsta pyramid som kan byggas med som h&ouml;gst $N$ block.</p>