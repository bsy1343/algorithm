# [Silver IV] Godishalsbandet - 20818

[문제 링크](https://www.acmicpc.net/problem/20818)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 173, 정답: 118, 맞힌 사람: 80, 정답 비율: 65.041%

### 분류

누적 합, 두 포인터, 슬라이딩 윈도우

### 문제 설명

<p>Alice vill dela ett godishalsband med Bob. Halsbandet best&aring;r av vita och bl&aring;a godisar. F&ouml;r att vara r&auml;ttvis vill Alice dela halsbandet i tv&aring; delar med lika m&aring;nga godisbitar i varje. Dock gillar Alice de bl&aring;a godisarna mycket mer &auml;n de vita, och vill d&auml;rf&ouml;r f&aring; s&aring; m&aring;nga bl&aring;a godisar i sin halva som m&ouml;jligt.</p>

<p>Vad &auml;r det st&ouml;rsta antalet bl&aring;a godisar Alice kan f&aring; i sin del, om hon klipper halsbandet optimalt?</p>

### 입력

<p>Indatan best&aring;r av en rad med en str&auml;ng som beskriver halsbandet. Str&auml;ngen best&aring;r endast av bokst&auml;verna <code>B</code> och <code>V</code>, och har totalt ett j&auml;mnt antal bokst&auml;ver.</p>

### 출력

<p>Skriv ut en rad med ett heltal, det maximala antalet bl&aring;a godisar Alice kan f&aring; i sin del av halsbandet.</p>

### 제한

<p>Halsbandet best&aring;r av h&ouml;gst&nbsp;1000000 godisar.</p>

### 힌트

<p>BBVVBVVVBB har l&auml;ngd 10 s&aring; Alice m&aring;ste dela halsbandet i tv&aring; delar med 5 godisar i varje. De m&ouml;jliga delarna hon kan f&aring; &auml;r BBVVB, BVVBV, VVBVV, VBVVV, BVVVB, VVVBB, VVBBB, VBBBB, BBBBV, BBBVV. Hon f&aring;r mest bl&aring;a godisar genom att v&auml;lja VBBBB eller BBBBV som har $4$ bl&aring;a godisar.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/20818.%E2%80%85Godishalsbandet/1c23c50e.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/20818.%E2%80%85Godishalsbandet/1c23c50e.png" data-original-src="https://upload.acmicpc.net/c993439d-8329-459d-b840-c8d60bb8a236/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 231px; height: 164px;" /></p>

<p style="text-align: center;">Figure 1.&nbsp;Ett av tv&aring; optimala s&auml;tt att klippa i exempelfall 1</p>