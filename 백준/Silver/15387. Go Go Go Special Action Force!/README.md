# [Silver V] Go Go Go Special Action Force! - 15387

[문제 링크](https://www.acmicpc.net/problem/15387)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 107, 정답: 88, 맞힌 사람: 55, 정답 비율: 82.090%

### 분류

구현

### 문제 설명

<p>You currently lead a special action force composed of 81 highly trained personnel. The force advances towards enemy forces using a 9&times;9 formation. Depending on the attack strategy, the force will break into 9 companies. Each company will be composed of 9 personnel having different positions. The positions in each company are as follows:</p>

<ul>
	<li>Officer (O)</li>
	<li>Warrant Officer (WO)</li>
	<li>Weapons Sergeant (WS)</li>
	<li>Engineer Sergeant (ES)</li>
	<li>Medical Sergeant (MS)</li>
	<li>Communication Sergeant (CS)</li>
	<li>Intelligence Sergeant (IS)</li>
	<li>Operations Sergeant (OS)</li>
	<li>Senior Sergeant (SS)</li>
</ul>

<p>There are 3 attack formations, namely infiltrate, flanking maneuver and deploy. In infiltrate, the personnel in front take the lead in infiltrating the enemy. This will result in 9 companies advancing in single file, as illustrated in Figure 1, towards the enemy to set up 9 strategic posts behind enemy lines.</p>

<p>In flanking maneuver, the alternate personnel on both sides of the formation takes lead to form 9 companies to attack the enemy from the sides. The left and right flanks will always have 4 and 5 companies respectively as shown in Figure 2.</p>

<table class="table" style="width:100%">
	<tbody>
		<tr>
			<td style="text-align:center; width:33%"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/15387.%E2%80%85Go%E2%80%85Go%E2%80%85Go%E2%80%85Special%E2%80%85Action%E2%80%85Force!/33bcf6f0.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/15387.%E2%80%85Go%E2%80%85Go%E2%80%85Go%E2%80%85Special%E2%80%85Action%E2%80%85Force!/33bcf6f0.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15387/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:200px; width:196px" /></td>
			<td style="text-align:center; width:34%"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/15387.%E2%80%85Go%E2%80%85Go%E2%80%85Go%E2%80%85Special%E2%80%85Action%E2%80%85Force!/439ec6ce.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/15387.%E2%80%85Go%E2%80%85Go%E2%80%85Go%E2%80%85Special%E2%80%85Action%E2%80%85Force!/439ec6ce.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15387/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:207px; width:285px" /></td>
			<td style="text-align:center; width:33%"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/15387.%E2%80%85Go%E2%80%85Go%E2%80%85Go%E2%80%85Special%E2%80%85Action%E2%80%85Force!/76e3e390.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/15387.%E2%80%85Go%E2%80%85Go%E2%80%85Go%E2%80%85Special%E2%80%85Action%E2%80%85Force!/76e3e390.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15387/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:181px; width:299px" /></td>
		</tr>
		<tr>
			<td style="text-align:center; width:33%">Figure 1: Infiltrate</td>
			<td style="text-align:center; width:34%">Figure 2: Flanking Maneuver</td>
			<td style="text-align:center; width:33%">Figure 3: Deploy</td>
		</tr>
	</tbody>
</table>

<p>Finally, in deploy, the force breaks out into 9 company formations of 3 &times; 3, with the center company forming the headquarters and the 8 companies forming satellite posts. Figure 3 shows that 9 companies is formed with the company at the center keeping their position.</p>

### 입력

<p>The first line of input contains a single integer G, the number of forces.</p>

<p>Each force is composed of 9 lines representing the force formation. Each line is composed of 9 personnel represented by their 1- or 2-letter positions delimited by single spaces.</p>

<p>Constraints</p>

<ul>
	<li>1 &le; G &le; 350</li>
	<li>Each string in the input is one of the (1- or 2-letter) position codes above.</li>
</ul>

### 출력

<p>For each force, output a single line containing the string &ldquo;all 3&rdquo; if the formation allows all 3 attack strategies, or &ldquo;not&rdquo; if not. (Both without quotes.)</p>