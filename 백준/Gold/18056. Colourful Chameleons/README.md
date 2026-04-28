# [Gold II] Colourful Chameleons - 18056

[문제 링크](https://www.acmicpc.net/problem/18056)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 26, 맞힌 사람: 25, 정답 비율: 67.568%

### 분류

애드 혹, 수학

### 문제 설명

<p>When Christian is not doing sophisticated research in software validation, he is breeding chameleons. His chameleons are of a special species and only occur in one of n distinct colours. Unlike their counterparts in nature, Christian&rsquo;s chameleons change their colour only under very specific circumstances. It took Christian quite a long time to develop his so-called Crazy Chameleon Colouring Concept (C<sup>4</sup>) which works as follows. If he puts n &minus; 1 chameleons with distinct colours in a special breeding terrarium, gives them strawberry cheese and liver sausage to eat, and lets them stay in the dark over night, then there will be y chameleons in the terrarium the next morning. The crazy thing is that none of the y chameleons has any of the n &minus; 1 original colours. Instead, all of them take on the colour that was not present in the breeding terrarium initially.</p>

<p>Last weekend Christian let a friend borrow his chameleons for the Christopher Street Day. Of course his friend wanted the chameleons to look as colourful as possible. That&rsquo;s why Christian applied the C<sup>4</sup> method in a way such that there were at least n &minus; 1 chameleons available of every single colour. Therefore, Christian currently has xi &ge; n &minus; 1 chameleons of the ith colour. However, the next holiday coming up is St. Patrick&rsquo;s Day and Christian thinks that it would be super cool if all his chameleons took on the same colour for this special event. He is wondering whether such a state can be reached by exclusively applying the C<sup>4</sup> method. Because he is running low on strawberry cheese, he would like to know the minimal number of C<sup>4</sup> applications needed for all his chameleons to take on the same colour - provided that this is even possible.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line with three integers n, c, and y:
	<ul>
		<li>n (2 &le; n &le; 10<sup>5</sup>), the number different colours that the Chameleons can take on.</li>
		<li>c (1 &le; c &le; n), the colour that all chameleons should have in the end.</li>
		<li>y (n &minus; 1 &le; y &le; 10<sup>9</sup>), the number of chameleons in the breeding terrarium after applying the C<sup>4</sup> method.</li>
	</ul>
	</li>
	<li>A line with n integers x<sub>1</sub>, . . . , x<sub>n</sub> (n &minus; 1 &le; x<sub>i</sub> &le; 10<sup>9</sup> for all i), where x<sub>i</sub> is the number of chameleons of the ith colour that Christian possesses initially.</li>
</ul>

### 출력

<p>If it is impossible for Christian&rsquo;s chameleons to all take on colour c by exclusively applying the C<sup>4</sup> method, output impossible. Otherwise output two integer numbers a and b, where a is the minimal number of C<sup>4</sup> applications necessary for all chameleons to have colour c, and b is the total number of chameleons that Christian possesses in the end.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18056.%E2%80%85Colourful%E2%80%85Chameleons/f33bf5e3.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/18056.%E2%80%85Colourful%E2%80%85Chameleons/f33bf5e3.png" data-original-src="https://upload.acmicpc.net/59208c7c-4855-40da-8435-05a7c8dc71f5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 619px; height: 287px;" /></p>

<p style="text-align: center;"><small>Images by <a href="https://pixabay.com/de/vectors/eidechse-rot-bunte-reptil-kriecht-46815/">OpenClipart-Vectors</a> on Pixabay.</small></p>

<p>Figure C.1: Illustration of the first sample case. Initially, Christian owns 2 yellow, 3 green, and 5 blue chameleons. After 5 applications of the C<sup>4</sup> method he has 10 green chameleons. The vectors (y, g, b) denote the number of yellow, green, and blue chameleons available in the respective breeding step.</p>