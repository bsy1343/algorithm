# [Silver III] You’ve goat me stumped - 20273

[문제 링크](https://www.acmicpc.net/problem/20273)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 512 MB

### 통계

제출: 67, 정답: 49, 맞힌 사람: 38, 정답 비율: 77.551%

### 분류

수학, 기하학

### 문제 설명

<p>When leaving goats to graze in a field, in order to ensure that they remain in place, it is customary to drive a wooden stake in the middle of the field and tether the goat to it to ensure that it does not run away. This allows the goat to roam within a disk-shaped pasture.</p>

<p>In the far region of Straitmeadows, the fields are long and narrow. This odd geometry has led to an even more peculiar habit of the shepherds. They put a collar on the goat and pass a rope through it (so that the rope can move freely), and they then tie each end of the rope to a stake. This allows the goat to move along the rope but remain sufficiently close to the two stakes.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/20273.%E2%80%85You%E2%80%99ve%E2%80%85goat%E2%80%85me%E2%80%85stumped/17739969.png" data-original-src="https://upload.acmicpc.net/343e1a10-5cbe-44ae-a76a-bd33ca89482d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 333px; height: 138px;" /></p>

<p>To ensure the goat doesn&#39;t starve, the shepherds need to know (very roughly) which area of grass the goat can graze in this fashion. You will assume that the goat and the stakes are 0-dimensional objects, that the rope is 1-dimensional, and that the field is a plane.</p>

### 입력

<p>The input file consists of multiple test cases. The first line of the input file consists of a single integer $c$ indicating the number of test cases. Each test case follows and consists of a single line which consists of two integers $\ell$ and $r$ separated by a single space. The integer $0 \leq \ell \leq 30$ indicates the distance between the two stakes in meters. The integer $\ell \leq r \leq 50$ indicates the length of the rope in meters.&nbsp;</p>

### 출력

<p>For each test case in the input, your program should produce one line consisting of a single integer which is the area of pasture that the goat can graze, rounded to the nearest hundred of square meters.</p>

### 힌트

<p>Image rights</p>

<ul>
	<li>Stake image:<a href="https://pixabay.com/vectors/croquet-stake-wood-game-148670/">https://pixabay.com/vectors/croquet-stake-wood-game-148670/</a>, public domain</li>
	<li>Goat image: <a href="https://pixabay.com/vectors/goat-drawing-animal-1456762/">https://pixabay.com/vectors/goat-drawing-animal-1456762/</a>, public domain</li>
</ul>