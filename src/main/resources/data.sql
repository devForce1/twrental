INSERT INTO car (price_per_day, make, model, reg_nr, is_booked) VALUES (200, 'Honda', 'lol', 'WZR946', TRUE),
                                                                       (300, 'Nissan', 'Lulz', 'HIV911', false);
INSERT INTO customer (username, full_name, address, email, phone) VALUES ('chrischansonichu', 'Christine Chandler', 'Vallmovägen 32, 456 73 Öje', 'chrischan@sonichu.com', '1-876-545-321');
INSERT INTO booking (customer_id, car_id, time_of_booking, nr_of_days) VALUES (1, 1, '2023-04-20', 14);