# [Gold IV] Fashion Police (Small) - 14367

[문제 링크](https://www.acmicpc.net/problem/14367)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 62, 정답: 28, 맞힌 사람: 26, 정답 비율: 49.057%

### 분류

브루트포스 알고리즘, 해 구성하기

### 문제 설명

<p>You are so excited about the 2016 Code Jam World Finals that you just moved to New York. You have brought along&nbsp;J&nbsp;different jackets (numbered 1 through&nbsp;J),&nbsp;P&nbsp;different pairs of pants (numbered 1 through&nbsp;P), and&nbsp;S&nbsp;different shirts (numbered 1 through&nbsp;S). You have at least as many shirts as pairs of pants, and at least as many pairs of pants as jackets. (J&nbsp;&le;&nbsp;P&nbsp;&le;&nbsp;S.)</p>

<p>Every day, you will pick one jacket, one pair of pants, and one shirt to wear as an&nbsp;outfit. You wash all of your garments every night so all of your garments are available to use each day.</p>

<p>In New York, the Fashion Police officers are always watching and keeping track of what everyone wears every day. If they find out that you have worn the exact same outfit twice, you will immediately be taken to the Fashion Jail on 5th Avenue for a mandatory makeover; you definitely want to avoid that! You will also immediately be taken to Fashion Jail if they find out that you have worn the same two-garment&nbsp;combination&nbsp;more than&nbsp;Ktimes in total. A combination consists of a particular jacket worn with a particular pair of pants, a particular jacket worn with a particular shirt, or a particular pair of pants worn with a particular shirt. For example, in the set of outfits (jacket 1, pants 2, shirt 3) and (jacket 1, pants 1, shirt 3), the combination (jacket 1, shirt 3) appears twice, whereas the combination (pants 1, shirt 3) only appears once.</p>

<p>You will wear one outfit per day. Can you figure out the largest possible number of days you can avoid being taken to Fashion Jail and produce a list of outfits to use each day?</p>

<ul>
</ul>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow; each consists of one line with four integers&nbsp;J,&nbsp;P,&nbsp;S, and&nbsp;K.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;J&nbsp;&le;&nbsp;P&nbsp;&le;&nbsp;S.</li>
	<li>1 &le;&nbsp;K&nbsp;&le; 10.</li>
	<li>S&nbsp;&le; 3.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is an integer: the maximum number of days you will be able to avoid being taken to Fashion Jail. Then output&nbsp;<code>y</code>&nbsp;more lines, each of which consists of three integers: the numbers of the jacket, pants, and shirt (in that order) for one day&#39;s outfit. The list of outfits can be in any order, but the outfits must not cause you to go to Fashion Jail as described in the statement above.</p>

<p>If multiple answers are possible, you may output any of them.</p>

### 힌트

<p>The sample output displays one set of answers to the sample cases. Other answers may be possible.</p>

<p>In Case #1, even though the Fashion Police officers have set a lenient&nbsp;K&nbsp;value of 10, there is only one possible outfit that you can form, so you can only avoid Fashion Jail for one day.</p>

<p>In Case #2, adding any other outfit would cause you to go to Fashion Jail:</p>

<ul>
	<li>Adding&nbsp;<code>1 1 3</code>&nbsp;would use the combination (jacket 1, pants 1) more than 2 times.</li>
	<li>Adding&nbsp;<code>1 2 2</code>&nbsp;would use the combination (jacket 1, pants 2) more than 2 times.</li>
</ul>

<p>In this case, any set of 5 outfits would include at least one fashion violation.</p>

<p>Note that the numbers of the jacket, pants, and shirt within an individual outfit do not have to be in nondecreasing order in the same way that&nbsp;J,&nbsp;P, and&nbsp;S&nbsp;do.</p>

<p>In Case #3, you have only one jacket + pants combination which you must keep reusing, so no matter which shirts you wear, you cannot form more than&nbsp;K&nbsp;= 2 different outfits.</p>

<p>In Case #4, another possible maximally large set of outfits is: <code>1 2 2 1 1 1</code></p>