# [Platinum I] Cross-Stitch - 18069

[문제 링크](https://www.acmicpc.net/problem/18069)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 15, 맞힌 사람: 14, 정답 비율: 66.667%

### 분류

그래프 이론, 그래프 탐색, 많은 조건 분기, 깊이 우선 탐색, 오일러 경로

### 문제 설명

<p>Cross-stitch is a form of needlework known since prehistoric times. A cross-stitch pattern consists of several crosses on the face of the fabric, that are connected on the backside. Traditionally, the whole pattern should be embroidered by one thread.</p>

<p>Carol is going to mass-produce cross-stitch patterns. Each pattern will be accompanied by the rectangular patch of fabric and the thread that is required to embroider this pattern. Carol wants to minimize the length of the thread that is required for the pattern.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18069.%E2%80%85Cross-Stitch/92c8e2e6.png" data-original-src="https://upload.acmicpc.net/f0e13987-2649-46b4-90a2-f96e0acfbeb1/-/crop/292x217/0,3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 146px; height: 109px;" /></p>

<p>You are given the face of the pattern. You should design the backside, so that the total length of the thread is minimal. The crosses on the pattern&rsquo;s face are 8-connected, i.e. it is possible to reach each cross from any other by a sequence of chess king&rsquo;s moves.</p>

### 입력

<p>The first line of the input contains two integers w and h &mdash; the width and the height of the patch of fabric (1 &le; w, h &le; 100).</p>

<p>The following h lines contain the face of the pattern. Each of them contains w characters, where &lsquo;X&rsquo; represents a cross, and &lsquo;.&rsquo; &mdash; an empty space. The face of the pattern contains at least one cross and crosses are 8-connected.</p>

### 출력

<p>The first line of output should contain the single integer n &mdash; the number of stitches required to embroider the pattern.</p>

<p>The following n + 1 lines should contain the coordinates of the points where a needle comes from the backside to the face or back: x<sub>i</sub>, y<sub>i</sub> for i = 0..n. The upper-left corner of the patch has coordinates (0, 0), and the bottom-right one &mdash; (w, h). The first stitch goes to the face of the pattern, the second one &mdash; to the backside, the third one &mdash; to the face, and so on. It is possible to duplicate stitches at the backside, but not at the face. None of the stitches should have zero length.</p>