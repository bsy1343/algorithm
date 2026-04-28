# [Platinum III] The Bugs - 18182

[문제 링크](https://www.acmicpc.net/problem/18182)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 24, 맞힌 사람: 22, 정답 비율: 44.000%

### 분류

자료 구조, 세그먼트 트리, 많은 조건 분기

### 문제 설명

<p>A submarine painted in bright plastic lemon color is investigating ocean depths and measuring the concentration of plastic yoctoparticles in the water. Each measurement (due to ingenious choice of the units) is a positive integer.</p>

<p>The measurement system is very recent, poorly tested and prone to errors. The project management suspects it is full of bugs. They find themselves in a time of trouble. Mother Mary also suspects it is full of bugs. Everybody cries: Help!</p>

<p>To identify and correct the bugs, they came together and decided to take the sequence of measured concentrations and analyze all triplets that occur in the sequence of measurements.</p>

<ul>
	<li>A triplet is a sequence of three integers.</li>
	<li>Each triplet is associated with its characteristic.</li>
	<li>The characteristic of a triplet (x, y, z) is a triplet (sgn(y &minus; x),sgn(z &minus; y),sgn(z &minus; x)). The value of the sgn(x) function is &minus;1, 0 or 1 for negative, zero or positive value of x, respectively.</li>
	<li>A triplet (x<sub>1</sub>, y<sub>1</sub>, z<sub>1</sub>) is smaller than triplet (x<sub>2</sub>, y<sub>2</sub>, z<sub>2</sub>) if and only if the first nonzero value in the triplet (x<sub>1</sub> &minus; x<sub>2</sub>, y<sub>1</sub> &minus; y<sub>2</sub>, z<sub>1</sub> &minus; z<sub>2</sub>) is negative.</li>
	<li>The label of a triplet T is the smallest triplet whose values are all positive and whose characteristic is equal to the characteristic of T.</li>
</ul>

<p>A measured triplet is a triplet which is a subsequence of the measurement sequence. That is, the elements of the triplet appear in the measurement sequence in the same order they appear in the triplet, but in the sequence they do not necessarily follow each other.</p>

<p>Before they are analyzed, the measured triplets are grouped according to their labels. The management wants to know in advance the set of labels of all measured triplets.</p>

### 입력

<p>The first line contains one integer N (3 &le; N &le; 2 &middot; 10<sup>5</sup>), the number of measurements. The next line contains N integers x<sub>1</sub>, x<sub>2</sub>, . . . , x<sub>N</sub> (1 &le; x<sub>i</sub> &le; 10<sup>9</sup>), each representing one measurement.</p>

### 출력

<p>Print, in the increasing order, all different labels of all measured triplets which can be obtained from the given sequence of measurements, one per line. A label should be printed with no spaces between its consecutive elements.</p>