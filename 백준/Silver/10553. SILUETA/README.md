# [Silver II] SILUETA - 10553

[문제 링크](https://www.acmicpc.net/problem/10553)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 89, 정답: 43, 맞힌 사람: 41, 정답 비율: 53.947%

### 분류

구현, 스위핑, 차분 배열 트릭

### 문제 설명

<p>The main hero of this task, painter Vincent, spent a great deal of his youth travelling the world. Sights from numerous voyages have often been the inspiration for his, nowadays highly praised, works of art. On one occasion, Vincent found himself in a metropolis full of skyscrapers so he got down to work right away, intoxicated by the marvelous sight. For a number of reasons, incomprehensible to an average programmer, Vincent decided to paint only the silhouettes of the skyscrapers seen before him. Unfortunately, a week after he finished this masterpiece, the painting spontaneously caught fire.</p>

<p>In order to reconstruct the painting, Vincent sought help in all directions; architects provided him with the exact dimensions of the skyscrapers, physicists ignored air resistance, mathematicians mapped everything onto a plane and now it&rsquo;s your turn!</p>

<p>From your perspective, Vincent&rsquo;s skyscrapers are rectangles whose sides are parallel to coordinate axes and with one side that lies on the abscissa. Part of the abscissa on the image should be shown with the characters &lsquo;*&rsquo;, the silhouettes of the skyscrapers with &lsquo;#&rsquo; and fill the rest of the image with &lsquo;.&rsquo;. The left edge of the image must begin with a skyscraper, whereas the right edge of the image must end with a skyscraper. Additionally, in order to verify the results the mathematicians got, output the perimeter of the given silhouette not calculating the sides that lie on the abscissa.</p>

### 입력

<p>The first line of input contains an integer N (1 &le; N &le; 10 000), the number of skyscrapers.</p>

<p>Each of the following N lines contains three integers L<sub>i</sub>, R<sub>i</sub> and H<sub>i</sub> (1 &le; L<sub>i</sub>, R<sub>i</sub>, H<sub>i</sub> &le; 1, 000, 3 &le; R<sub>i</sub> - L<sub>i</sub> &le; 1, 000) that describe the position of the ith skyscraper. That skyscraper, in a Cartesian coordinate system, is considered a rectangle with its lower left corner in (L<sub>i</sub>, 0) and upper right corner in (R<sub>i</sub>, H<sub>i</sub>).</p>

### 출력

<p>The first line of output must contain the perimeter of Vincent&rsquo;s silhouette.</p>

<p>The next h+1 lines, where h+1 is the height of the highest skyscraper, must contain Vincent&rsquo;s drawing as described in the task.</p>

### 힌트

<p>Clarification of the first example: Blue color denotes the skyscrapers&rsquo; silhouette (character &lsquo;#&rsquo;), whereas yellow is the part of abscissa located on Vincent&rsquo;s painting (character &lsquo;*&rsquo;).</p>

<p style="text-align: center;"><img alt="" src="/upload/images2/ex.png" style="height:285px; width:602px" /></p>