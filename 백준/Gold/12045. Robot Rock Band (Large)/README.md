# [Gold III] Robot Rock Band (Large) - 12045

[문제 링크](https://www.acmicpc.net/problem/12045)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 512 MB

### 통계

제출: 109, 정답: 72, 맞힌 사람: 52, 정답 비율: 60.465%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵, 중간에서 만나기

### 문제 설명

<p>You&#39;re the manager of Xorbitant, the world&#39;s first robot rock band. There will be four positions in the band, and there are&nbsp;<strong>N</strong>&nbsp;robots auditioning for each position. (No robot is auditioning for more than one position.) Every robot has a number, and multiple robots might have the same number, just as two people can have the same name.</p>

<p>You know from market research that your robot audiences won&#39;t care how well the robot band members make music, how handsome they are, or what scandalous things the tabloids say about them. Instead, the audience will be checking to see whether the four members&#39; numbers, when bitwise XORed together, equal a certain trendy number&nbsp;<strong>K</strong>.</p>

<p>How many different sets of four robots (one for each position) is it possible to choose so that the band will have this property? More specifically, given four lists A, B, C, D containing&nbsp;<strong>N</strong>&nbsp;numbers each, how many ways are there to choose one number&nbsp;<em>a</em>&nbsp;from list A, one number&nbsp;<em>b</em>&nbsp;from list B, and so on, such that&nbsp;<em>a</em>^<em>b</em>^<em>c</em>^<em>d</em>&nbsp;=&nbsp;<strong>K</strong>? (Here ^ represents the bitwise XOR operation.)</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each case begins with one line with two space-separated integers,&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>K</strong>, as described above. Then, four more lines follow. Each has&nbsp;<strong>N</strong>&nbsp;space-separated integers and represents the ID numbers of the robots auditioning for a certain position in the band.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 10.</li>
	<li>0 &le;&nbsp;<strong>K</strong>&nbsp;&le; 10<sup>9</sup>.</li>
	<li>0 &le; all robot numbers &le; 10<sup>9</sup>.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the number of different bands that meet the conditions.</p>

### 힌트

<p>In sample case #1, in order to get a combined bitwise XOR of 3, the robot chosen from the second list must be 2, and the robot chosen from the fourth list must be 1. For the first and third lists, either of the two 0 robots can be chosen, so there are 2 * 2 = 4 possible bands that meet the criteria. Note that even though all of these bands are of the form (0, 2, 0, 1), they are considered different because the selections from the lists were different.</p>