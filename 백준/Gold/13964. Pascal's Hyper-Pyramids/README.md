# [Gold I] Pascal's Hyper-Pyramids - 13964

[문제 링크](https://www.acmicpc.net/problem/13964)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 46, 맞힌 사람: 44, 정답 비율: 84.615%

### 분류

수학, 집합과 맵, 조합론, 백트래킹

### 문제 설명

<p>We programmers know and love Pascal&#39;s triangle: an array of numbers with 1 at the top and whose entries are the sum of the two numbers directly above (except numbers at both ends, which are always 1). For programming this generation rule, the triangle is best represented left-aligned; then the numbers on the left column and on the top row equal 1 and every other is the sum of the numbers immediately above and to its left. The numbers highlighted in bold correspond to the base of Pascal&#39;s triangle of height 5:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13964.%E2%80%85Pascal's%E2%80%85Hyper-Pyramids/b56de0f0.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13964.%E2%80%85Pascal's%E2%80%85Hyper-Pyramids/164653f0.png" data-original-src="https://boja.mercury.kr/assets/problem/13964-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:107px; width:116px" /></p>

<p>Pascal&#39;s hyper-pyramids generalize the triangle to higher dimensions. In 3 dimensions, the value at position (x,y,z) is the sum of up to three other values:</p>

<ul>
	<li>(x,y,z-1), the value immediately below it if we are not on the bottom face (z=0);</li>
	<li>(x,y-1,z), the value&nbsp;immediately behind&nbsp;if we are not on the back face (y=0);</li>
	<li>(x-1,y,z),&nbsp;the value&nbsp;immediately to the left&nbsp;if we are not on the leftmost&nbsp;face (x=0);</li>
</ul>

<p>The following figure depicts Pascal&#39;s 2D-pyramid of height 5 as a series of plane cuts obtained by fixing the value of the z coordinate.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13964.%E2%80%85Pascal's%E2%80%85Hyper-Pyramids/2ab4056d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13964.%E2%80%85Pascal's%E2%80%85Hyper-Pyramids/62293fbb.png" data-original-src="https://boja.mercury.kr/assets/problem/13964-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:117px; width:480px" /></p>

<p>For example, the number at position x=1, y=2, z=1 is the sum of the values at (0,2,1), (1,1,1) and (1,2,0), namely, 6+3+3=12. The base of the pyramid corresponds to a plane of positions such that x+y+z=4 (highlighted on bold above).</p>

<p>The size of each layer grows quadratically with the height of the pyramid, but there are many repeated values due to symmetries: numbers at positions that are permutations of one another must be equal. For example, the numbers at positions (0,1,2), (1,2,0) and (2,1,0) above are all equal to 3.</p>

<p>Write a program that, given the number of dimensions D of the hyper-space and the height H of a hyper-pyramid, computes the set of numbers at the base.</p>

### 입력

<p>A single line with two positive integers: the number of dimensions, D, and the height of the hyper-pyramid, H.</p>

### 출력

<p>The set of numbers at the base of the hyper-pyramid, with no repetitions, one number per line, and in ascending order.</p>

### 제한

<ul>
	<li>2 &le; D &lt; 32 Number of dimensions</li>
	<li>1 &le; H &lt; 32 Height</li>
	<li>D and H are such that all numbers in the hyper-pyramid are less than 2<sup>63</sup>.</li>
</ul>