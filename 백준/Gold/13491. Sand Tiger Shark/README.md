# [Gold IV] Sand Tiger Shark - 13491

[문제 링크](https://www.acmicpc.net/problem/13491)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 28, 맞힌 사람: 21, 정답 비율: 75.000%

### 분류

백트래킹, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 구현, 시뮬레이션

### 문제 설명

<p>Sand tiger sharks are among the most frequently kept &ldquo;big&rdquo; sharks in aquariums. That&rsquo;s because despite their scary&nbsp;appearance, they are actually quite chill and docile, and don&rsquo;t need huge tanks. One of their interesting characteristics is&nbsp;their reproductive strategy. Like other fish, they produce eggs, but the mother keeps the eggs in her uterus, where they&nbsp;hatch into embryos. Those embryos then live in the uterus for a while longer, where the oldest/largest embryo gradually&nbsp;eats all of his/her brothers and sisters, until there&rsquo;s only one sand tiger shark left who is then born. This practice is&nbsp;called &ldquo;intrauterine cannibalism.&rdquo;</p>

<p>This works pretty well for the oldest sibling, but kind of sucks for all the others. They don&rsquo;t have much to aim for, but&nbsp;could try to at least survive as long as possible before being eaten. Here, you are to help a shark embryo calculate a&nbsp;strategy for staying alive as long as possible.</p>

<p>We will model intrauterine cannibalism as follows. Each day, each shark embryo that is still alive when it is its turn will&nbsp;eat one other shark embryo, and more specifically, all embryos except you will always eat the largest embryo smaller than&nbsp;themselves. (We will ensure that all sizes are distinct, so don&rsquo;t worry about tie breaking.) If there is no smaller embryo,&nbsp;then a shark embryo will not eat anything. They do this in order of decreasing size. When it is your turn, you are allowed&nbsp;to deviate, and eat any embryo smaller than you (or not eat anyone, if you prefer). You can never eat an embryo larger&nbsp;than yourself. When an embryo eats another embryo, its new size will be the sum of their previous sizes.</p>

<p>As an illustration, suppose that you are the 5th largest embryo initially. First, the largest one will eat the 2nd largest&nbsp;one, resulting in an embryo of the sum of their sizes. As a result of being eaten, the 2nd largest one does not get to eat&nbsp;anyone, and the 3rd largest one will eat the 4th largest, producing an embryo with the sum of their sizes. Now it&rsquo;s your&nbsp;turn. After everyone has had their turn, we start again at the beginning, with the order determined by the new sizes.</p>

<p>Your goal is to survive as many rounds as you can.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line of the data set contains two integers n, m with 2 &le; n &le; 50 and 2 &le; m &le; n. n is the number of initial&nbsp;shark embryos, and m is the number of the embryo that you are planning for. This is followed by a line with n integers&nbsp;10<sup>6</sup> &gt; s<sub>1</sub> &gt; s<sub>2</sub> &gt; s<sub>3</sub> &gt; &middot;&middot;&middot; &gt; s<sub>n</sub> &ge; 0; si is the size of the ith embryo.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then output the day on which embryo&nbsp;m will get eaten if following an optimal strategy.</p>

<p>Each data set should be followed by a blank line.</p>