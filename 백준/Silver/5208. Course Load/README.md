# [Silver I] Course Load - 5208

[문제 링크](https://www.acmicpc.net/problem/5208)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 17, 맞힌 사람: 12, 정답 비율: 60.000%

### 분류

구현, 브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>USC offers a large number of fantastic courses that you may wish to take during your time here. There are classes on algorithms, stage make-up, chemical dependence and substance use, civil right litigation, the universe, yoga, leadership, and many more. But when you try to decide which classes to take, you always run into two problems:</p>

<ul>
	<li>The most exciting classes always overlap with each other.</li>
	<li>There are only so many hours in the day to work and study.</li>
</ul>

<p>If you want to be a bit more systematic about it, you could solve this as an optimization problem. For each class you are considering, you could assign a utility u, the benefit you would derive from taking this class (this benefit could be fun, or job skills, or whatever else). In addition, each class has a workload w, how many units of work per week are required to pass. (Notice that the workload may not correlate with the number of times the class meets per week.) Finally, you have the schedule for each class. You want to select a set of classes that don&rsquo;t overlap in their meeting times, and have a total workload not exceeding your work capacity C, maximizing your utility.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of each data set contains three numbers n, m and C. 1 &le; n &le; 20 is the number of classes you are considering. 1 &le; m &le; 100 is the number of class meeting slots in the week (a meeting slot could for instance be &ldquo;Monday from 3:30-4:50&rdquo;). The number C with 1 &le; C &le; 100 is your capacity for class work.</p>

<p>This is followed by n lines, each describing one class. The first number on the line for class i is the (integer) utility u<sub>i</sub> &ge; 0 of the class, the second one is the workload w<sub>i</sub> &ge; 0. The third number mi is the number of times the class meets per week. This is followed (on the same line) by m<sub>i</sub> numbers between 1 and m, each being one meeting time that the class occupies.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the maximum utility that can be achieved by any non-overlapping set of classes of total workload at most C. (You do not need to output which set of classes achieves this utility.)</p>