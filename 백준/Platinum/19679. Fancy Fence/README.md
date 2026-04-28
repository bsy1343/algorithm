# [Platinum III] Fancy Fence - 19679

[문제 링크](https://www.acmicpc.net/problem/19679)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 228, 정답: 61, 맞힌 사람: 52, 정답 비율: 30.588%

### 분류

수학, 자료 구조, 조합론, 스택

### 문제 설명

<p>Everybody knows that Bal&aacute;zs has the fanciest fence in the whole town. It&rsquo;s built up from <em>N</em> fancy sections. The sections are rectangles standing closely next to each other on the ground. The <em>i</em>th section has integer height <em>h<sub>i</sub></em> and integer width <em>w<sub>i</sub></em>.</p>

<p>We are looking for fancy rectangles on this fancy fence.</p>

<p>A rectangle is fancy if:</p>

<ul>
	<li>its sides are either horizontal or vertical and have integer lengths</li>
	<li>the distance between the rectangle and the ground is integer</li>
	<li>the distance between the rectangle and the left side of the first section is integer</li>
	<li>it&rsquo;s lying completely on sections</li>
</ul>

<p>What is the number of fancy rectangles?</p>

<p>This number can be very big, so we are interested in it modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>The first line contains <em>N</em>, the number of sections.</p>

<p>The second line contains <em>N</em> space-separated integers, the <em>i</em>th number is <em>h<sub>i</sub></em>.</p>

<p>The third line contains <em>N</em> space-separated integers, the <em>i</em>th number is <em>w<sub>i</sub></em>.</p>

### 출력

<p>You should print a single integer, the number of fancy rectangles modulo 10<sup>9</sup> + 7. So the output range is 0, 1, 2, . . . , 10<sup>9</sup> + 6.</p>

### 제한

<ul>
	<li>1 &le; <em>N</em> &le; 10<sup>5</sup></li>
	<li>1 &le; <em>h<sub>i</sub></em>, <em>w<sub>i</sub></em> &le; 10<sup>9</sup></li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19679.%E2%80%85Fancy%E2%80%85Fence/741a153c.png" data-original-src="https://upload.acmicpc.net/6a5d819f-5d24-4d35-9f2c-a6c6b48a3427/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 275px; height: 159px;" /></p>

<p>There are 5 fancy rectangles of shape:&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19679.%E2%80%85Fancy%E2%80%85Fence/e24b93fd.png" data-original-src="https://upload.acmicpc.net/c611186a-5f91-4b5e-8fb1-f8c0f9934ab4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 48px; height: 49px;" /></p>

<p>There are 3 fancy rectangles of shape:&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19679.%E2%80%85Fancy%E2%80%85Fence/377074d7.png" data-original-src="https://upload.acmicpc.net/cd3eba33-898b-4e56-b4e6-64a4573a15bb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 86px; height: 48px;" /></p>

<p>There is 1 fancy rectangle of shape:&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19679.%E2%80%85Fancy%E2%80%85Fence/c546772b.png" data-original-src="https://upload.acmicpc.net/c6bfcdf1-9d1f-40d6-9d61-7dde3abcea7f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 126px; height: 52px;" /></p>

<p>There are 2 fancy rectangles of shape:&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19679.%E2%80%85Fancy%E2%80%85Fence/caed7860.png" data-original-src="https://upload.acmicpc.net/a7c7583d-2eec-485b-b405-0900978db573/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 45px; height: 81px;" /></p>

<p>There is 1 fancy rectangle of shape:&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19679.%E2%80%85Fancy%E2%80%85Fence/cc07b346.png" data-original-src="https://upload.acmicpc.net/e81cf1b1-cc56-4e51-aeb3-885087036a27/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 78px; height: 78px;" /></p>