# [Bronze II] Construction of Chand Baori - 31324

[문제 링크](https://www.acmicpc.net/problem/31324)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 231, 정답: 90, 맞힌 사람: 74, 정답 비율: 39.153%

### 분류

수학, 구현, 조합론

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/ab0cfbfd-cd38-4a2c-a5e6-e3197954494c/-/preview/" style="width: 200px; height: 132px; float: right;" />The Indian stepped well Chand Baori is, with some simplifications, a pyramid tapering down. Faces of the pyramid are made up of rows of trapezoid stairs which can be used to descend to reach the water. The first (lowest) level is a single stairway with two flights of stairs on the left and on the right. The second level has two such stairways, etc.</p>

<p>To visit the &quot;Harshat Mata&quot; shrine dedicated to the goddess of happiness and joy pilgrims need to cleanse themselves in the waters of the well, that is, to descend to the very bottom. Pilgrims on their way to the water can only descend or walk horizontally along the current level, but not climb up.</p>

<p>The builders of the well want to construct it in such a way that the number of possible ways of descend would be no less than the number of pilgrims. Two paths are considered different if there exists a level with a different stairway used for descending, or different flight of the same stairway used.</p>

### 입력

<p>The first line of the input file contains two integers $N$ and $M$  -- the number of levels in the well and the number of pilgrims descending along the single face, respectively ($1 \le N \le 20$, $0 \le M \le 1.5 \cdot 10^{18}$). </p>

### 출력

<p>The output file must contain  &quot;<code>Harshat Mata</code>&quot;, if the number of possible ways to descend along one face of the well is less than the given number of pilgrims (also for one face), otherwise it must contain &quot;<code>Nope</code>&quot;.</p>

### 힌트

<p>For a two-level well there exist eight different ways of descent shown in the picture (parts of the same route are marked with the same digit).</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/8710add5-0050-4953-9aa1-74926694074c/-/preview/" /></p>