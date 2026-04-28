# [Silver I] Tracking Fake News - 14773

[문제 링크](https://www.acmicpc.net/problem/14773)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

구현, 그래프 이론, 그래프 탐색, 시뮬레이션, 너비 우선 탐색

### 문제 설명

<p>When fake news spreads, it often uses social networks as its conduit. A friend posts a story that agrees with your pre-conceived ideas and prejudices (e.g., the presidential candidate of the other party participated in some nefarious activity that you can easily ascribe to them), and you will believe it much more uncritically than if it disagrees with your preferences. As a result, you will post the story, and your friends will see it, etc. A sufficiently juicy and pandering piece of &ldquo;news&rdquo; can spread like wildfire. In this problem, you will simulate the spread of a piece of fake news, when you know the social network and the proclivities of the individuals, as well as where in the network the piece of fake news originated.</p>

<p>To keep our model simple (if a bit unrealistic), we will assume that there are a number of different categories i that matter to you, like which political side the story reflects positively on, how much sex it contains, how much violence it contains, etc. For each of those categories, each individual has an integer (positive or negative) number w<sub>j,i</sub> describing his/her weight for it. Each individual also has a target tj for total content. Each story also has an integer content c<sub>i</sub> for each category. Individual j likes a story exactly iff &Sigma;<sub>i</sub>w<sub>j,i</sub>c<sub>i</sub> = t<sub>j</sub>. (This is a very stringent requirement, but easy to compute.) If they like it, they will repost, otherwise not. We assume that each person sees all stories posted by their friends, and no stories posted by their non-friends (unless friends repost them).</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains two integers n, r; 1 &le; n &le; 1000 is the number of individuals in the social network, and 1 &le; r &le; 100 is the number of categories that matter for stories.</p>

<p>The next line is a single line containing exactly r integers, between -100 and 100, inclusive; these are the c<sub>i</sub>.</p>

<p>Next come n lines, each describing one individual j in the network. The first r numbers on the line are the w<sub>j,i</sub>; they are integers between -10 and 10, inclusive. Next comes the integer t<sub>j</sub>, between -1000000 and 1000000, inclusive. After that comes one integer d<sub>j</sub> with 0 &le; d<sub>j</sub> &le; n &minus; 1, which gives you the number of friends of j. This is followed by d<sub>j</sub> distinct integers, all between 1 and n, inclusive, and not equal to j. This is the list of j&rsquo;s friends. We will always ensure that if j&prime; is a friend of j, then j will also be a friend of j&prime;.</p>

<p>The fake news story will always start at person 1, though he/she may not even post it if it doesn&rsquo;t appeal to them.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the total number of people who have posted the fake news story by the time no one new posts.</p>

<p>Each data set should be followed by a blank line.</p>