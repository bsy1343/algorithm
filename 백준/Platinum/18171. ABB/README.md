# [Platinum IV] ABB - 18171

[문제 링크](https://www.acmicpc.net/problem/18171)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 437, 정답: 249, 맞힌 사람: 210, 정답 비율: 58.824%

### 분류

문자열, KMP, 매내처

### 문제 설명

<p>Fernando was hired by the University of Waterloo to finish a development project the university started some time ago. Outside the campus, the university wanted to build its representative bungalow street for important foreign visitors and collaborators.</p>

<p>Currently, the street is built only partially, it begins at the lake shore and continues into the forests, where it currently ends. Fernando&rsquo;s task is to complete the street at its forest end by building more bungalows there. All existing bungalows stand on one side of the street and the new ones should be built on the same side. The bungalows are of various types and painted in various colors.</p>

<p>The whole disposition of the street looks a bit chaotic to Fernando. He is afraid that it will look even more chaotic when he adds new bungalows of his own design. To counterbalance the chaos of all bungalow shapes, he wants to add some order to the arrangement by choosing suitable colors for the new bungalows. When the project is finished, the whole sequence of bungalow colors will be symmetric, that is, the sequence of colors is the same when observed from either end of the street.</p>

<p>Among other questions, Fernando wonders what is the minimum number of new bungalows he needs to build and paint appropriately to complete the project while respecting his self-imposed bungalow color constraint.</p>

### 입력

<p>The first line contains one integer N (1 &le; N &le; 4 &middot; 10<sup>5</sup>), the number of existing bungalows in the street. The next line describes the sequence of colors of the existing bungalows, from the beginning of the street at the lake. The line contains one string composed of N lowercase letters (&ldquo;a&rdquo; through &ldquo;z&rdquo;), where different letters represent different colors.</p>

### 출력

<p>Output the minimum number of bungalows which must be added to the forest end of the street and painted appropriately to satisfy Fernando&rsquo;s color symmetry demand.</p>