def solution(phone_number):
    star = (len(phone_number)-4) * "*"
    
    phone_number = phone_number.replace(phone_number[0:len(phone_number)-4], star)
    return phone_number