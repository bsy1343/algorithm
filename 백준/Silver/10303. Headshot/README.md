# [Silver V] Headshot - 10303

[문제 링크](https://www.acmicpc.net/problem/10303)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

수학

### 문제 설명

<p>You have a revolver gun with a cylinder that has n chambers. Chambers are located in a circle on a cylinder. Each chamber can be empty or can contain a round. One chamber is aligned with the gun&#39;s barrel. When trigger of the gun is pulled, the gun&#39;s cylinder rotates, aligning the next chamber with the barrel, hammer strikes the round, making a shot by firing a bullet through the barrel. If the chamber is empty when the hammer strikes it, then there is no shot but just a &ldquo;click&rdquo;.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/10303.%E2%80%85Headshot/2c585966.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/10303.%E2%80%85Headshot/2c585966.png" data-original-src="https://www.acmicpc.net/upload/images2/headshot.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:223px; width:542px" /></p>

<p>You have found a use for this gun. You are playing Russian Roulette with your friend. Your friend loads rounds into some chambers, randomly rotates the cylinder, aligning a random chamber with a gun&#39;s barrel, puts the gun to his head and pulls the trigger. You hear &ldquo;click&rdquo; and nothing else -- the chamber was empty and the gun did not shoot.</p>

<p>Now it is your turn to put the gun to your head and pull the trigger. You have a choice. You can either pull the trigger right away or you can randomly rotate the gun&#39;s cylinder and then pull the trigger. What should you choose to maximize the chances of your survival?</p>

### 입력

<p>The input file contains several datasets. A dataset contains a single line with a string of n digits &ldquo;0&rdquo; and &ldquo;1&rdquo; ( 2 &le; n &le;100). This line of digits represents the pattern of rounds that were loaded into the gun&#39;s chambers. &ldquo;0&rdquo; represent an empty chamber, &ldquo;1&rdquo; represent a loaded one. In this representation, when cylinder rotates before a shot, the next chamber to the right gets aligned with the barrel for a shot. Since the chambers are actually located on a circle, the first chamber in this string follows the last one. There is at least one &ldquo;0&rdquo; in this string.</p>

### 출력

<p>For each dataset, write to the output file one of the following words (without quotes):</p>

<ul>
	<li>&ldquo;SHOOT&rdquo; -- if pulling the trigger right away makes you less likely to be actually shot in the head with the bullet (more likely that the chamber will be empty).</li>
	<li>&ldquo;ROTATE&rdquo; -- if randomly rotating the cylinder before pulling the trigger makes you less likely to be actually shot in the head with the bullet (more likely that the chamber will be empty).</li>
	<li>&ldquo;EQUAL&rdquo; -- if both of the above choices are equal in terms of probability of being shot.</li>
</ul>