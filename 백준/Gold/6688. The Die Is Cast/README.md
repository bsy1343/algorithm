# [Gold V] The Die Is Cast - 6688

[문제 링크](https://www.acmicpc.net/problem/6688)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 17, 맞힌 사람: 12, 정답 비율: 57.143%

### 분류

그래프 이론, 그래프 탐색, 정렬, 격자 그래프, 플러드 필

### 문제 설명

<p>According to a usually reliable source (that does not want to be published), the dangerous anarchist group New Tomorrow (aka NT 2000) prepares a frontal attack against the Congress Center. The anarchists had big troubles choosing the proper moment to begin with their attack. Finally, they have agreed upon to let the fortune decide. They are going to play dice (which is, moreover, good thing to have fun while waiting for the action) and when six dots appear on the top side of all dice, it is the signal to begin the attack.</p>

<p>The police knows that and they want to be informed about the signal. Fortunately, the area around the Congress Center is monitored with cameras. Thus, the police can have the picture of the anarchists in any given moment during their play. To automate the processing, they need a program that gets the bitmap image and determines the outcome of the throw that has just been performed, i.e., the the number of dots visible on each die.</p>

<p>We make the following assumptions about the input images. The images contain only three different pixel values: for the background, the dice and the dots on the dice. We consider two pixels connected if they share an edge -- meeting at a corner is not enough. In the figure, pixels A and B are connected, but B and C are not.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6688.%E2%80%85The%E2%80%85Die%E2%80%85Is%E2%80%85Cast/8dfe1143.gif" data-original-src="%EB%B0%B1%EC%A4%80/Gold/6688.%E2%80%85The%E2%80%85Die%E2%80%85Is%E2%80%85Cast/8dfe1143.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6688/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:77px; width:73px" /></p>

<p>A set S of pixels is connected if for every pair a,b of pixels in S, there is a sequence a<sub>1</sub>, a<sub>2</sub>, ... a<sub>k</sub> in S such that a = a<sub>1</sub>, b = a<sub>k</sub>, and for any 1 &lt;= i &lt; l, a<sub>i</sub> and a<sub>i+1</sub> are connected.</p>

<p>We consider all maximally connected sets consisting solely of non-background pixels to be dice. &quot;Maximally connected&quot; means that you cannot add any other non-background pixels to the set without making it disconnected. Likewise, we consider every maximal connected set of dot pixels to form a dot.</p>

### 입력

<p>The input consists of pictures of several dice throws. Each picture description starts with a line containing two numbers H and W, the height and width of the picture, respectively, 1 &lt;= W,H &lt;= 500.</p>

<p>The following H lines contain W characters each. The characters can be: dot (&quot;.&quot;) for a background pixel, asterisk (&quot;*&quot;) for a pixel of a die, and &quot;X&quot; for a pixel of a die&#39;s dot. The picture will contain at least one die, and the numbers of dots per die is between 1 and 6, inclusive. The maximal number of dice in the picture is limited only by its size.</p>

<p>Dice and dots may have different sizes and may not be entirely square due to optical distortion. In fact, they can have arbitrary shape, as far as they remain connected. Anyway, you can assume the dice cannot be &quot;hollow&quot;, i.e., if we consider all the pixels outside the picture to be background, all background pixels are connected.</p>

<p>The input is terminated by a picture starting with w = h = 0, which should not be processed.</p>

### 출력

<p>For each throw of dice, output a single line containing the text &quot;Throw:&quot; followed by a space and the number of dots on all the dice in the picture, sorted in increasing order. Numbers should be separated with a single space.</p>

<p>&nbsp;</p>