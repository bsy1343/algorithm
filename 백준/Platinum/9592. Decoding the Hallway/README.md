# [Platinum III] Decoding the Hallway - 9592

[문제 링크](https://www.acmicpc.net/problem/9592)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 57, 정답: 20, 맞힌 사람: 19, 정답 비율: 51.351%

### 분류

재귀, 문자열

### 문제 설명

<p>Edward is now 21 years old. He has to appear in an exam to renew his State Alchemist title. This year the exam is arranged in a bit different way. There will be a long hallway. Each alchemist will enter the hallway from the left side and come out from the right side and he has to do this n times. During this tour they have to bend the hallway segments right-left alternatively. Let&rsquo;s describe the process in some pictures:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9592.%E2%80%85Decoding%E2%80%85the%E2%80%85Hallway/2a50db9b.png" data-original-src="https://www.acmicpc.net/upload/images2/hall.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:101px; width:592px" /></p>

<ul>
	<li>First time (First picture): Initially, the hallway is a straight line (soft line in the first picture). So alchemist will bend this segment to right side (he is going from left to right) like the hard line in the first picture above.</li>
	<li>Second time (Second picture): Now he will find two segments in hallway (like soft line in picture). So he will bend the first hallway to right, second one to left (like the hard lines).</li>
	<li>Third time (Third picture): Now he will find four segments in the hallway (like the soft lines) and he will bend them to Right, Left, Right and Left respectively.</li>
	<li>And this goes on for fourth and fifth times in the picture.</li>
</ul>

<p>Since Full Metal Alchemist Edward is so good, he did it perfectly. Now it is turn of the judges to check the bending if it is correct or not. The judge enters at the left end and comes out from the right end. But during his travel he notes down the turning, R for Right and L for Left. So if n = 1, then the judge would have noted down L. If n = 2, it would have been LLR. For n = 4, it would have been: LLRLLRRLLLRRLRR.</p>

<p>Since this string will grow exponentially with n, it will be tough to check whether the bending is correct or not. So the judges have some pre-generated strings and they know whether this string will appear as substring in the final string or not. Unfortunately the judges have lost the answer sheet, can you help them to recover it?</p>

### 입력

<p>First line of the test file contains a positive integer T denoting number of test cases (T &lt;= 10<sup>5</sup>). Hence follows T lines, each containing an integer and a string: n S. n is the number of times Edward has passed through the hallway; and S is the string the judge is going to check with. You may assume that S consists of only the letters L and R. (n &lt;= 1000, length of S &lt;= 100). Also you may assume that length of S will not be greater than the length of the string for n.</p>

### 출력

<p>For each test case output the case number and Yes or No denoting whether the string is in the final string as substring.</p>