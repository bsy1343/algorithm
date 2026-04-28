# [Gold I] Experiment "X": Explosions Expected - 7474

[문제 링크](https://www.acmicpc.net/problem/7474)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 4, 맞힌 사람: 3, 정답 비율: 27.273%

### 분류

임의 정밀도 / 큰 수 연산, 조합론, 포함 배제의 원리, 수학

### 문제 설명

<p>Unlucky scientist Vasya was tired of permanent mockeries of his colleagues. He built a time machine to go away into the future. But his machine had taken him into the past and then exploded!</p>

<p>Vasya needed some way to earn money! He has taken the job of the Court Alchemist of King Arthur. His first task is to create the philosophers&rsquo; stone. Vasya has found <em>K</em> ingredients and now conducts experiments which consist in mixing these ingredients in various proportions. More formally, each experiment consists in taking <em>a<sub>1</sub></em> ounces of the first ingredient, <em>a<sub>2</sub></em> ounces of the second and so on. Then all the ingredients are put into the crucible, carefully mixed and heated. All <em>a<sub>i</sub></em> are non-negative integers, and their sum does not exceed S - the capacity of the crucible. In all Vasya&rsquo;s experiments at least two ingredients are taken, i.e. there are at least two <em>a<sub>i</sub></em> greater than zero.</p>

<p>But all his experiments have been unsuccessful up to now. All mixtures have exploded! The King is unpleased. Maids of honour complain to Queen Guinevere about these awful explosion sounds! The King has decided to give one last chance to Vasya. Tomorrow Vasya is to conduct his next experiment, which could become the last. If the mixture explodes again, Vasya will be executed.</p>

<p>Fortunately, Vasya has just found a way to discard some definitely unsuccessful experiments. He has noted that if for some experiment plan (<em>a<sub>1</sub></em>, <em>a<sub>2</sub></em>, ... , <em>a<sub>K</sub></em>) the mixture has exploded, it would explode for any plan (<em>b<sub>1</sub></em>, <em>b<sub>2</sub></em>, ...&nbsp;, <em>b<sub>K</sub></em>) such that <em>b<sub>i</sub></em> &ge; <em>a<sub>i</sub></em> for all <em>i</em>. Now Vasya wants to count the number of possible experiments which are not definitely unsuccessful according to his unfortunate experience. He has taken out his pocket computer and now he is writing a program which will compute this number. Can you do this?</p>

### 입력

<p>The first line of input file contains three positive integers 2 &le; <em>K</em> &le; 30, 2 &le; <em>S</em> &le; 10000, 0 &le; <em>M</em> &le; 20 where <em>M</em> is the number of experiments Vasya has already conducted. The next <em>M</em> lines contain <em>K</em> numbers each, one line per experiment.</p>

### 출력

<p>Output the number of possible experiment plans for which it is not evident that the mixture would explode.</p>