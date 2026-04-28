# [Gold II] Class Schedule - 4142

[문제 링크](https://www.acmicpc.net/problem/4142)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 플로이드–워셜

### 문제 설명

<p>At Fred Hacker&#39;s school, there are <em>T &times; C</em> classes, divided into <em>C</em> catagories of <em>T</em> classes each. The day begins with all the category 1 classes being taught simultaneously. These all end at the same time, and then all the category 2 classes are taught, etc. Fred has to take exactly one class in each category. His goal is to choose the set of classes that will minimize the amount of ``energy&#39;&#39; required to carry out his daily schedule.</p>

<p>The energy requirement of a schedule is the sum of the energy requirement of the classes themselves, and energy consumed by moving from one class to the next through the schedule.</p>

<p>More specifically, taking the <em>j</em>th class in the <em>i</em>th category uses <em>E<sub>ij</sub></em> units of energy. The rooms where classes take place are located at integer positions (ranging from 0 to <em>L</em>) along a single hallway. The <em>j</em>th class in the <em>i</em>th category is located at position <em>P<sub>ij</sub></em>. Fred starts the day at position 0, moves from class to class, according to his chosen schedule, and finally exits at location <em>L</em>. Moving a distance <em>d</em> uses <em>d</em> units of energy.</p>

### 입력

<p>The first line of the input is <em>Z &le; 20</em> the number of test cases. This is followed by <em>Z</em> test cases. Each test case begins with three space-separated integers: <em>C</em>, <em>T</em>, and <em>L</em>. Each of the following <em>C&times; T</em> lines gives, respectively, the location and energy consumption of a class. The first <em>T</em> lines represent the classes of category 1, the next <em>T</em> lines represent the classes of category 2, and so on. No two classes in the same category will have the same location.</p>

<ul>
	<li>1 &le; C &le; 25</li>
	<li>1 &le; T &le; 1000</li>
	<li>1 &le; L &le; 1,000,000</li>
	<li>1 &le; E<sub>ij</sub> &le; 1,000,000</li>
	<li>0 &le; P<sub>ij</sub> &le; L</li>
</ul>

### 출력

<p>For each input instance, the output will be a single integer on a line by itself which is the minimum possible energy of a schedule satisfying the constraints.</p>

### 힌트

<p>Fred must take 3 classes every day, and for each he has 2 choices. The hall has length 5. His first possible class is located at position 2 and will take 1 unit of energy each day, etc.</p>

<ul>
	<li>Here is one way to obtain the minimum energy:</li>
	<li>Go to the class at location 2. Energy used: 3</li>
	<li>Next, go to the class at location 4. Energy used: 6</li>
	<li>Then go to the class at location 3. Energy used: 9</li>
	<li>Finally, leave the school at location 5. Energy used: 11</li>
</ul>