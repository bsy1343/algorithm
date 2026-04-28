# [Gold V] P-Networks - 5758

[문제 링크](https://www.acmicpc.net/problem/5758)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 19, 맞힌 사람: 16, 정답 비율: 66.667%

### 분류

정렬, 해 구성하기

### 문제 설명

<p>Pretty Networks Inc. is a company that builds some curious artifacts whose purpose is to transform a set of input values in a given way. The transformation is determined by what they call a p-network. The following picture shows an example of a p-network.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5758/1.png" style="height:107px; width:389px" /></p>

<p>In the general case, a p-network of order N and size M, has N horizontal wires numbered 1, 2, . . . N, and M vertical strokes. Each stroke connects two consecutive wires. There are no two different strokes touching the same point of any wire, and there is no stroke touching the leftmost or rightmost point of any wire. The above example is a p-network of order 5 and size 9.</p>

<p>The transformation determined by a p-network can be explained using a set of rules that govern the way a p-network should be traversed:</p>

<ol>
	<li>start at the leftmost point of one wire, and go to the right;</li>
	<li>each time a stroke appears move to the connected wire, and keep going from left to right;</li>
	<li>stop when the rightmost point of one wire is reached.</li>
</ol>

<p>If starting at wire i the traversing ends at wire j, we say that the p-network transforms i into j, and we denote this with i &rarr; j. In the above example the p-network determines the set of transformations</p>

<p style="text-align: center;">{1 &rarr; 3, 2 &rarr; 5, 3 &rarr; 4, 4 &rarr; 1, 5 &rarr; 2} .</p>

<p>Pretty Networks Inc. hired you to solve the following p-network design problem: given a number N and a set of transformations {1 &rarr; i<sub>1</sub>, 2 &rarr; i<sub>2</sub>, . . . N &rarr; i<sub>N</sub>}, decide if a p-network of order N can be built to accomplish them and, in this case, give one that does it.</p>

<p>When there exists a solution with a certain size, in many cases there is another solution with a greater size. Scientists at Pretty Networks Inc. have stated that if there exists a solution for a p-network design problem, then there is a solution with size less than 4N<sup>2</sup>. Therefore, they are interested only in solutions having a size below this bound.</p>

### 입력

<p>The input has a certain number of p-network design problems. Each problem is described in just one line that contains the values N, i<sub>1</sub>, i<sub>2</sub>, . . . i<sub>N</sub>, separated by a single blank space. The value N is the order of the desired p-network, i.e., its number of wires (1 &le; N &le; 20). The values i<sub>1</sub>, i<sub>2</sub>, . . . i<sub>N</sub> represent that the p-network should determine the set of transformations {1 &rarr; i<sub>1</sub>, 2 &rarr; i<sub>2</sub>, . . . N &rarr; i<sub>N</sub>} (1 &le; i<sub>j</sub> &le; N, for each 1 &le; j &le; N). The input ends with a line in which N = 0; this line must not be processed as a p-network design problem.</p>

### 출력

<p>For each p-network design problem in the input, the output must contain a single line. If the problem has no solution the line must be No solution. Otherwise the line must contain a description of any p-network (with N wires and less than 4N<sup>2</sup> strokes) that accomplishes the requested set of transformation. This description is given by a set of values M, s<sub>1</sub>, s<sub>2</sub>, . . . s<sub>M</sub>, where consecutive values are separated by a single blank space. The value M is the size of the p-network, i.e., its number of strokes. The values s<sub>1</sub>, s<sub>2</sub>, . . . s<sub>M</sub> describe the strokes of the p-network; it should be understood that the i-th stroke from left to right, connects the wires s<sub>i</sub> and 1 + s<sub>i</sub> (1 &le; i &le; M). Notice that 0 &le; M &lt; 4N<sup>2</sup> , while 1 &le; s<sub>i</sub> &lt; N for each 1 &le; i &le; M.</p>