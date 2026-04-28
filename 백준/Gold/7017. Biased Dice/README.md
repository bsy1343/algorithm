# [Gold III] Biased Dice - 7017

[문제 링크](https://www.acmicpc.net/problem/7017)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 12, 맞힌 사람: 10, 정답 비율: 58.824%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Professor Random, known for his research on randomized algorithms, is now conducting an experiment on biased dice. His experiment consists of dropping a number of dice onto a plane, one after another from a fixed position above the plane. The dice fall onto the plane or dice already there, without rotating, and may roll and fall according to their property. Then he observes and records the status of the stack formed on the plane, specifically, how many times each number appears on the faces visible from above. All the dice have the same size and their face numbering is identical, which we show in Figure C-1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7017.%E2%80%85Biased%E2%80%85Dice/44390b93.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7017.%E2%80%85Biased%E2%80%85Dice/44390b93.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7017/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:155px; width:194px" /></p>

<p style="text-align: center;">Figure C-1: Numbering of a die</p>

<p>The dice have very special properties, as in the following.</p>

<p>(1) Ordinary dice can roll in four directions, but the dice used in this experiment never roll in the directions of faces 1, 2 and 3; they can only roll in the directions of faces 4, 5 and 6. In the situation shown in Figure C-2, our die can only roll to one of two directions.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7017.%E2%80%85Biased%E2%80%85Dice/36d38b0d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7017.%E2%80%85Biased%E2%80%85Dice/36d38b0d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7017/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:224px; width:426px" /></p>

<p style="text-align: center;">Figure C-2: An ordinary die and a biased die</p>

<p>(2) The die can only roll when it will fall down after rolling, as shown in Figure C-3. When multiple possibilities exist, the die rolls towards the face with the largest number among those directions it can roll to.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7017.%E2%80%85Biased%E2%80%85Dice/c89ac3e2.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7017.%E2%80%85Biased%E2%80%85Dice/c89ac3e2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7017/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:212px; width:429px" /></p>

<p style="text-align: center;">Figure C-3: A die can roll only when it can fall</p>

<p>(3) When a die rolls, it rolls exactly 90 degrees, and then falls straight down until its bottom face touches another die or the plane, as in the case [B] or [C] of Figure C-4.</p>

<p>(4) After rolling and falling, the die repeatedly does so according to the rules (1) to (3) above.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7017.%E2%80%85Biased%E2%80%85Dice/a5ac983b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7017.%E2%80%85Biased%E2%80%85Dice/a5ac983b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7017/4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:345px; width:702px" /></p>

<p style="text-align: center;">Figure C-4: Example stacking of biased dice</p>

<p>For example, when we drop four dice all in the same orientation, 6 at the top and 4 at the front, then a stack will be formed as shown in Figure C-4.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7017.%E2%80%85Biased%E2%80%85Dice/ee362505.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7017.%E2%80%85Biased%E2%80%85Dice/ee362505.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7017/5.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:233px; width:428px" /></p>

<p style="text-align: center;">Figure C-5: Example records</p>

<p>After forming the stack, we count the numbers of faces with 1 through 6 visible from above and record them. For example, in the left case of Figure C-5, the record will be &quot;0 2 1 0 0 0&quot;, and in the right case, &quot;0 1 1 0 0 1&quot;.</p>

### 입력

<p>The input consists of several datasets each in the following format.</p>

<pre>
n 
t<sub>1</sub>  f<sub>1</sub>
t<sub>2</sub>  f<sub>2</sub>
... 
t<sub>n</sub>  f<sub>n</sub></pre>

<p>Here, n (1 &le; n &le; 100) is an integer and is the number of the dice to be dropped. t<sub>i</sub> and f<sub>i</sub> (1 &le; t<sub>i</sub>, f<sub>i</sub> &le; 6) are two integers separated by a space and represent the numbers on the top and the front faces of the i-th die, when it is released, respectively.</p>

<p>The end of the input is indicated by a line containing a single zero.</p>

### 출력

<p>For each dataset, output six integers separated by a space. The integers represent the numbers of faces with 1 through 6 correspondingly, visible from above. There may not be any other characters in the output.</p>