# [Platinum V] Confectionery - 3617

[문제 링크](https://www.acmicpc.net/problem/3617)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 16, 정답: 7, 맞힌 사람: 4, 정답 비율: 33.333%

### 분류

수학, 구현, 그리디 알고리즘, 시뮬레이션

### 문제 설명

<p>ACM Inc., the manufacturer of Automatic Confectionery Mixers, often receives complaints for its ACM-07 household devices. The weak place of ACM-07 is the main feeder &mdash; the vertical plastic tube which contains syrup before it is injected into the mixing unit. The main feeder gets cracked due to mixer vibrations, and the syrup drains through the cracks.</p>

<p>The last complaint was an unusual one. Margaret called ACM Inc. customer support service to express her thanks. She told that her cakes and pastry became incredibly tasty, and she was never able to have the same success without the mixer. The company manager was greatly surprised with this story and decided to send Alex &mdash; an ACM-07 constructor &mdash; to investigate the case.</p>

<p>Margaret is a daughter of a mathematician, so she always cooks according to the same formalized algorithm and uses the same ingredients. There are n various fruit syrups, which are poured into the feeder one after another, from 1 to n. Syrups have different densities and normally don&rsquo;t mix. When all syrups are in place, Margaret opens the valve and lets the liquid flow to the mixing unit.</p>

<p>Alex found that the main feeder of the mixer was broken in several places, and some amount of syrup drains through the cracks, therefore not getting to the mixing unit. He told Margaret about this, and now she believes that the taste is so special because the proportions of syrups has changed due to drains. Fortunately, the syrups don&rsquo;t mix while running through the feeder, and Alex volunteered to help Margaret to calculate the syrup proportions after passing the feeder tube.</p>

<p>Each syrup is characterized by its fluidity. If the syrup with fluidity &alpha; is located at the crack of size d in the feeder, each second &alpha;d cm<sup>3</sup> of syrup drains out of the crack. Similarly, if the syrup of fluidity &alpha; is at the bottom of the feeder, each second &alpha;q cm<sup>3</sup> of syrup flows through the hole at the bottom of the feeder into the mixing unit. Given the positions of the cracks on the feeder, their sizes and the size of the hole at the bottom of the feeder, as well as the initial amount of each syrup, find the amount of each syrup that eventually gets to the mixing unit.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3617.%E2%80%85Confectionery/0f2f8640.png" data-original-src="https://upload.acmicpc.net/d8867a3a-7b8f-493c-8d21-5e03fbe63872/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 508px; height: 253px;" /></p>

### 입력

<p>The first line of the input file contains n &mdash; the number of syrups (1 &le; n &le; 10), m &mdash; the number of cracks (0 &le; m &le; 10), and s &mdash; the area of the perpendicular section of the feeder in cm<sup>2</sup> (1.0 &le; s &le; 100.0).</p>

<p>The following n lines describe syrups. Each line contains two real numbers: v<sub>i</sub> &mdash; the initial volume of the syrup in cm<sup>3</sup> and &alpha;<sub>i</sub> &mdash; the fluidity of the syrup. The syrups are described in order from the one at&nbsp;the bottom of the feeder to the one at the top (1.0 &le; v<sub>i</sub>, &alpha;<sub>i</sub> &le; 100.0).</p>

<p>The following m lines describe cracks. Each crack is described with two real numbers: x<sub>i</sub> and d<sub>i</sub> &mdash; the distance from the bottom of the feeder to the crack, and its size, respectively (1.0 &le; x<sub>i</sub> &le; 1000.0, 0.1 &le; d<sub>i</sub> &le; 10.0). You can consider the size of cracks be small relative to the size of the feeder, so you can treat them as points.</p>

<p>The last line of the input file contains a real number q (0.1 &le; q &le; 100.0).</p>

### 출력

<p>Print n real numbers &mdash; for each syrup print the volume of the syrup that eventually gets to the mixing unit. Print at least four digits after the decimal point.</p>