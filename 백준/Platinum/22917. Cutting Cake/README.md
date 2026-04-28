# [Platinum I] Cutting Cake - 22917

[문제 링크](https://www.acmicpc.net/problem/22917)

### 성능 요약

시간 제한: 45 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 13, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

임의 정밀도 / 큰 수 연산, 미적분학, 고속 푸리에 변환, 수학, 스위핑

### 문제 설명

<p>Today is your and your twin sibling&#39;s birthday. To celebrate, you got a rectangular cake to share. The cake is decorated with N triangular patches of icing (which may overlap). All the icing patches were created with the same triangular mold, so they have the same shape and orientation. Although you and your twin are very similar, your tastes in icing are much different. This difference is formalized by each of you having a different enjoyment value for each patch of icing. Specifically, your enjoyment value for eating the entire i⁠-⁠th patch of icing is A<sub>i</sub>, and your twin&#39;s is B<sub>i</sub>. If someone eats part of a patch, they get enjoyment proportional to the eaten area. For example, if you eat 2/3 of the area of the i⁠-⁠th icing patch, you would get 2A<sub>i</sub>/3 enjoyment from it. Note that there may be some flavors of icing that you or your twin do not enjoy, so the A<sub>i</sub> and/or B<sub>i</sub> values can be negative.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22917.%E2%80%85Cutting%E2%80%85Cake/9c25005f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22917.%E2%80%85Cutting%E2%80%85Cake/9c25005f.png" data-original-src="https://upload.acmicpc.net/8bea7659-5b32-486d-b2f6-63faab370c66/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>You will cut the cake into two rectangular pieces by making a single vertical cut (parallel to the Y-axis). After cutting the cake, you will eat the left piece and your twin will eat the right piece. Your total enjoyment is the sum of the enjoyment you get from all icing to the left of the cut. Similarly, your twin&#39;s enjoyment is the sum of the enjoyment they get from all icing to the right of the cut.</p>

<p>To be as fair as possible, you want to cut the cake such that the absolute value of the difference between your total enjoyment and your twin&#39;s total enjoyment is as small as possible. Given the N triangular icing patches on a rectangular cake, what is the minimum possible absolute value of the difference between your and your twin&#39;s total enjoyments you can get?</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow. Each test case starts with a line containing three positive integers, N, W, and H, representing the number of icing patches on the cake and the width and height of the top of the cake, respectively. The bottom-left corner of the cake is located at (0, 0) and the top-right corner is at (W, H). Then, a line describing the icing patch mold follows. This line contains four integers: P, Q, R, and S. The icing patch mold is a triangle with vertices at (0, 0), (P, Q), and (R, S). Then, N lines follow. The i⁠-⁠th of these lines contains four integers X<sub>i</sub>, Y<sub>i</sub>, A<sub>i</sub>, and B<sub>i</sub>. The i⁠-⁠th patch is a triangle with vertices at (X<sub>i</sub>, Y<sub>i</sub>), (X<sub>i</sub> + P, Y<sub>i</sub> + Q), and (X<sub>i</sub> + R,Y<sub>i</sub> + S). You would get A<sub>i</sub> enjoyment from eating it and your twin would get B<sub>i</sub> enjoyment.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y/z</code>, where x&nbsp;is the test case number (starting from 1) and&nbsp;y/z&nbsp;is the minimum absolute value of the difference between your and your twin&#39;s total enjoyment that can be achieved with a single vertical cut as an irreducible fraction (that is,&nbsp;z&nbsp;must be positive and of minimum possible value).</p>

### 힌트

<p>In Sample Case #1, there is a single icing patch. The optimal cut is to the left of the patch. You will eat no icing and receive 0 enjoyment. Your twin will eat all of the icing patch and receive 5 enjoyment from it. The absolute value of the difference between your and your twin&#39;s enjoyments is |0&minus;5|=5.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22917.%E2%80%85Cutting%E2%80%85Cake/3b724b43.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22917.%E2%80%85Cutting%E2%80%85Cake/3b724b43.png" data-original-src="https://upload.acmicpc.net/a754ed2a-ea44-40a3-9baa-1f5cacf41c97/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" />&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22917.%E2%80%85Cutting%E2%80%85Cake/a4cdf7cb.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22917.%E2%80%85Cutting%E2%80%85Cake/a4cdf7cb.png" data-original-src="https://upload.acmicpc.net/70d7aad9-0270-4c0c-9a0b-4ff43458a318/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>In Sample Case #2, there are two icing patches. The optimal cut is at X = 15099999.99. Notice that the numerator and denominator of the answer can get very large.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22917.%E2%80%85Cutting%E2%80%85Cake/fb0d0c6c.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22917.%E2%80%85Cutting%E2%80%85Cake/fb0d0c6c.png" data-original-src="https://upload.acmicpc.net/50cac805-a507-48e9-9d8f-7809a3021b59/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" />&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22917.%E2%80%85Cutting%E2%80%85Cake/5a87d187.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22917.%E2%80%85Cutting%E2%80%85Cake/5a87d187.png" data-original-src="https://upload.acmicpc.net/8ea5aea3-2c24-4781-9b03-6e0bc16d6a40/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>In Sample Case #3, there are two icing patches. The optimal cut is at X = 4. You will eat 75% of the first icing patch and receive &minus;3 enjoyment from it. Your twin will eat 25% of the first icing patch and all of the second icing patch getting 5 &sdot; 0.25 + 5 = 6.25 enjoyment. The absolute value of the difference between your and your twin&#39;s enjoyments is |&minus;3 &minus; 6.25| = 9.25 = 37/4.</p>

<p>Notice that cutting at X = 1 would give you 0 enjoyment and your twin 10 enjoyment. While both of those values are greater than the corresponding enjoyment when cutting at X = 4, the difference between them is 10 &gt; 9.25, which means cutting at X = 4 is preferable anyway.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22917.%E2%80%85Cutting%E2%80%85Cake/783a5430.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22917.%E2%80%85Cutting%E2%80%85Cake/783a5430.png" data-original-src="https://upload.acmicpc.net/840e1a5e-8fd4-4f87-8aee-5687af5564be/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" />&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22917.%E2%80%85Cutting%E2%80%85Cake/321c32a3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22917.%E2%80%85Cutting%E2%80%85Cake/321c32a3.png" data-original-src="https://upload.acmicpc.net/f7000519-c692-41af-ba0b-1650c987fd10/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>In Sample Case #4, there are three icing patches. The optimal cut is at X &asymp; 521241077.6027.</p>